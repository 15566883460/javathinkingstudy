package com.dlyong.concurrency;

/**
 * 从java思想中学习并发的知识（第二十一章）
 * @author dlyong
 */
public class ListOff implements Runnable {


    protected int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;
    public ListOff () {}
    public ListOff (int countDown) {
        this.countDown = countDown;
    }
    public String status () {
        return "#"+id+"("+(countDown>0?countDown:"ListOff!")+"),";
    }

    @Override
    public void run() {
        while (countDown-- > 0) {

            System.out.println(status());
            Thread.yield();
        }
    }


}
