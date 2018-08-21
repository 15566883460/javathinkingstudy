package com.dlyong.concurrency;

public class MoreBasicThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(new ListOff());
            t.start();
        }
        System.out.printf("Waiting fot ListOff");
    }
}
