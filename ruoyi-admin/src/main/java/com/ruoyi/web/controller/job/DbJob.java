package com.ruoyi.web.controller.job;

import com.ruoyi.common.utils.DbUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

/**
 * @author oweson
 * @date 2020/11/10 21:54
 */

@Component
public class DbJob {
    private final Log logger = LogFactory.getLog(DbJob.class);

    @Autowired
    private Environment environment;

    /**
     * 1 定时时间是每天凌晨5点。
     *  url: jdbc:mysql://127.0.0.1:3307/ry?useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&useSSL=true&serverTimezone=GMT%2B8
     *                 username: root
     *                 password: 111111
     */
    //@Scheduled(cron = "0 0 5 * * ?")
    public void backup() throws IOException {
        logger.info("系统开启定时任务数据库备份");
      /*  String user = environment.getProperty("spring.datasource.druid.username");
        String password = environment.getProperty("spring.datasource.druid.password");
        String url = environment.getProperty("spring.datasource.druid.url");*/
        String user = "root";
        String password = "111111";
        String url = "jdbc:mysql://127.0.0.1:3307/ry?useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&useSSL=true&serverTimezone=GMT%2B8";
        int index1 = url.indexOf("3307/");
        int index2 = url.indexOf("?");
        // todo 截取数据库的名字,不定长！
        String db = url.substring(index1 + 5, index2);

        LocalDate localDate = LocalDate.now();
        String fileName = localDate.toString() + ".sql";
        File file = new File("backup", fileName);
        file.getParentFile().mkdirs();
        file.createNewFile();

        // 备份今天数据库
        DbUtil.backup(file, user, password, db);
        // 删除七天前数据库备份文件
        LocalDate before = localDate.minusDays(7);
        String fileBeforeName = before.toString()+".sql";
        File fileBefore = new File("backup", fileBeforeName);
        if (fileBefore.exists()) {
            fileBefore.delete();
        }

        logger.info("系统结束定时任务数据库备份");
    }

    public static void main(String[] args) throws IOException {
        new DbJob().backup();
    }
}
