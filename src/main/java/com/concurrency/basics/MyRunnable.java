package com.concurrency.basics;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("I am my-runnable");
    }
}
