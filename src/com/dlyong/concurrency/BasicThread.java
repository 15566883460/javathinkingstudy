package com.dlyong.concurrency;

public class BasicThread {

    public static void main(String[] args) {
        Thread t = new Thread(new ListOff());
        t.start();
        System.out.println("Wating for ListOff");
    }

}
