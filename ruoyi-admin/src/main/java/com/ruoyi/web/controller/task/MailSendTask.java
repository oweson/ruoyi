package com.ruoyi.web.controller.task;


import com.ruoyi.system.common.MailConstants;
import com.ruoyi.system.domain.SysUser;
import com.ruoyi.system.mq.MailSendLog;
import com.ruoyi.system.service.ISysUserService;
import com.ruoyi.system.service.impl.MailSendLogService;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class MailSendTask {
    @Autowired
    MailSendLogService mailSendLogService;
    @Autowired
    RabbitTemplate rabbitTemplate;
    @Autowired
    ISysUserService employeeService;

    @Scheduled(cron = "0/10 * * * * ?")
    public void mailResendTask() {
        List<MailSendLog> logs = mailSendLogService.getMailSendLogsByStatus();
        if (logs == null || logs.size() == 0) {
            return;
        }
        logs.forEach(mailSendLog -> {
            if (mailSendLog.getCount() >= 3) {
                mailSendLogService.updateMailSendLogStatus(mailSendLog.getMsgId(), 2);
                //直接设置该条消息发送失败
            } else {
                mailSendLogService.updateCount(mailSendLog.getMsgId(), new Date());
                SysUser sysUser = employeeService.selectUserById(mailSendLog.getEmpId());
                rabbitTemplate.convertAndSend(MailConstants.MAIL_EXCHANGE_NAME, MailConstants.MAIL_ROUTING_KEY_NAME, sysUser, new CorrelationData(mailSendLog.getMsgId()));
            }
        });
    }
}
