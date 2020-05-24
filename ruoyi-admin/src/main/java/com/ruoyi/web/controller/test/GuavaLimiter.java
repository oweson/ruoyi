package com.ruoyi.web.controller.test;

import com.google.common.util.concurrent.RateLimiter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GuavaLimiter {
    static long nanoTime = 0L;

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        nanoTime = System.nanoTime();
        RateLimiter rateLimiter = RateLimiter.create(2.0);
        for (int i = 0; i < 20; i++) {
            rateLimiter.acquire();
            executorService.execute(() -> {
                long current = System.nanoTime();
                System.out.println((current - nanoTime) / 1000_000);
                nanoTime = current;
            });
        }
    }
}
