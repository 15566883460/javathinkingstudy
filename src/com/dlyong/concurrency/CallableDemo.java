package com.dlyong.concurrency;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 从任务中产生返回值
 */

class TaskWithResult implements Callable<String> {

    private int id ;
    public TaskWithResult(int id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        return "result of TaskWithResult" + id;
    }


}
public class CallableDemo {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        ArrayList<Future<String>> arrayList = new ArrayList<Future<String>>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(executorService.submit(new TaskWithResult(i)));
        }
        for (Future<String> future : arrayList) {
            try {
                System.out.println("args = [" + future.get() + "]");
            }catch (Exception e){
                System.out.println(e);
            }finally {
                executorService.shutdown();
            }

        }
    }
}