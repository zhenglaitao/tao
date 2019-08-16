package com.three.samplebootmdc.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TestService {


    @Async
    public void asyncMethod1() {
        log.info("asyncMethod1-----start");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("asyncMethod1-----end");
    }

    @Async
    public void asyncMethod2() {
        log.info("asyncMethod2-----start");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("asyncMethod2-----end");
    }

    @Async
    public void asyncMethod3() {
        log.info("asyncMethod3-----start");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("asyncMethod3-----end");
    }
}
