/*
package com.ruoyi.web.controller.mq.consumer;

import com.alibaba.fastjson.JSON;
import com.ruoyi.web.controller.mq.consumer.message.Demo01Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

*/
/**
 * @author oweson
 * @date 2021/5/9 14:56
 *//*


@RabbitListener(queues = Demo01Message.QUEUE)
@Component
public class Demo1Consumer {
    private Logger logger = LoggerFactory.getLogger(getClass());
    // 1 用户下单，扣减库存、发短信、发货、异步MQ完成！

    @RabbitHandler
    public void onMessage(String message) {
        System.out.println("start----------------------");
        System.out.println(message);
        logger.info("[onMessage][线程编号:{} 消息内容：{}]", Thread.currentThread().getId(), message);
        System.out.println("end-------------------------");
        Demo01Message demo01Message = JSON.parseObject(message, Demo01Message.class);
        System.out.println(demo01Message);
    }
}
*/
