package com.tgram.xzjcjw.schedule;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class TestSchedleTask {

    private final Log logger = LogFactory.getLog(TestSchedleTask.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

//    @Scheduled(fixedRate = 3000)
    public void reportCurrentTime() {
        System.out.println("当前时间：" + dateFormat.format(new Date()));
    }

    /**
     * 第一次延迟1秒执行，当执行完后3秒再执行
     */
//    @Scheduled(initialDelay = 1000, fixedDelay = 3000)
    public void timerInit() {
        System.out.println("init : " + dateFormat.format(new Date()));
    }

    /**
     * 每天19点50分50秒时执行
     */
//    @Scheduled(cron = "50 50 19 * * ?")
    public void timerCron() {
        System.out.println("current time : " + dateFormat.format(new Date()));
    }
}
