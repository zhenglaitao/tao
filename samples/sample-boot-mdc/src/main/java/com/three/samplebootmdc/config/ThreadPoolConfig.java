package com.three.samplebootmdc.config;

import com.three.samplebootmdc.util.ThreadMdcUtil;
import org.slf4j.MDC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.util.concurrent.ListenableFuture;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

@Configuration
public class ThreadPoolConfig {

    @Bean("taskExecutor")
    public ThreadPoolTaskExecutor taskExecutor() {
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor(){
            @Override
            public void execute(Runnable task) {
                super.execute(ThreadMdcUtil.wrap(task, MDC.getCopyOfContextMap()));
            }

            @Override
            public void execute(Runnable task, long startTimeout) {
                super.execute(ThreadMdcUtil.wrap(task, MDC.getCopyOfContextMap()), startTimeout);
            }

            @Override
            public Future<?> submit(Runnable task) {
                return super.submit(ThreadMdcUtil.wrap(task, MDC.getCopyOfContextMap()));
            }

            @Override
            public <T> Future<T> submit(Callable<T> task) {
                return super.submit(ThreadMdcUtil.wrap(task, MDC.getCopyOfContextMap()));
            }

            @Override
            public ListenableFuture<?> submitListenable(Runnable task) {
                return super.submitListenable(ThreadMdcUtil.wrap(task, MDC.getCopyOfContextMap()));
            }

            @Override
            public <T> ListenableFuture<T> submitListenable(Callable<T> task) {
                return super.submitListenable(ThreadMdcUtil.wrap(task, MDC.getCopyOfContextMap()));
            }
        };
        threadPoolTaskExecutor.setCorePoolSize(5);
        threadPoolTaskExecutor.setMaxPoolSize(10);
        threadPoolTaskExecutor.setQueueCapacity(200);
        threadPoolTaskExecutor.setThreadNamePrefix("task-work");
        threadPoolTaskExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        threadPoolTaskExecutor.initialize();
        return threadPoolTaskExecutor;
    }
}
