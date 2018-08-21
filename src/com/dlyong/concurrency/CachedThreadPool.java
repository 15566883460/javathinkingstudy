package com.dlyong.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 可缓存的线程
 */
public class CachedThreadPool {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 5; i++)
            executorService.execute(new ListOff());
        executorService.shutdown();


    }
}
