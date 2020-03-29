package com.ruoyi.quartz.task;

import java.util.Date;
import java.util.HashMap;

import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.quartz.domain.SysJob;
import com.ruoyi.quartz.service.ISysJobService;
import com.ruoyi.quartz.test.DownloadExcel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import com.ruoyi.common.utils.StringUtils;

import java.util.List;

/**
 * 定时任务调度测试
 *
 * @author ruoyi
 */
@Component("ryTask")
public class RyTask {
    @Autowired
    private ISysJobService jobService;
    // 待任务新建以后生成的id调用此方法
    @Async
    public void generatorExcel(Long id){
        DownloadExcel.test();
        System.out.println(Thread.currentThread().getName()+"============================================");
        // todo 生成报表存储本地；

    }

    public void ryMultipleParams(String s, Boolean b, Long l, Double d, Integer i) {
        System.out.println(StringUtils.format("执行多参方法： 字符串类型{}，布尔类型{}，长整型{}，浮点型{}，整形{}", s, b, l, d, i));
    }

    @Async
    public void ryParams(String params) {
        System.out.println("执行有参方法：" + params);
        System.out.println(Thread.currentThread().getName() + "*********************************************");
    }

    @Async
    public void ryNoParams() {
        System.out.println("执行无参方法");
        System.out.println(Thread.currentThread().getName() + "*********************************************");
    }


    @Async
    public void generatorReportTest() {
        List<SysJob> sysJobs = jobService.selectJobList(null);
        for (int i = 0; i < 10; i++) {
            SysJob sysJob = new SysJob();
            sysJob.setJobId(0L);
            sysJob.setJobName(i + "");
            sysJob.setJobGroup(i + "");
            sysJob.setInvokeTarget("");
            sysJob.setCronExpression("");
            sysJob.setMisfirePolicy("");
            sysJob.setConcurrent("");
            sysJob.setStatus("");
            sysJob.setSearchValue("");
            sysJob.setCreateBy("");
            sysJob.setCreateTime(new Date());
            sysJob.setUpdateBy("");
            sysJob.setUpdateTime(new Date());
            sysJob.setRemark("");
            sysJob.setParams(new HashMap<String, Object>());
        }
        ExcelUtil<SysJob> util = new ExcelUtil<SysJob>(SysJob.class);
        util.exportExcel(sysJobs, "导出啦");
        System.out.println("数据导出啦"+Thread.currentThread().getName()+"************************************");


    }

}
