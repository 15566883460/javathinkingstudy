package com.dlyong.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * 有限的线程
 */
public class FixedThreadPool {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        for (int i = 0; i < 5; i++)
            executorService.execute(new ListOff());
        executorService.shutdown();


    }
}
