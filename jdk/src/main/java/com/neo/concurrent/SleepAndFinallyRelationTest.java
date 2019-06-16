package com.neo.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SleepAndFinallyRelationTest {

    private static final ExecutorService pool = Executors.newFixedThreadPool(10);

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            final String index = String.valueOf(i);
            pool.submit(new Runnable() {
                public void run() {
                    Thread.currentThread().setName("thread-" + index);
                    long i = 0;
                    try {
                        i = System.currentTimeMillis();
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        long c = System.currentTimeMillis();
                        System.out.println(Thread.currentThread().getName() + " : " + (c - i));
                    }
                }
            });
        }
    }
}
