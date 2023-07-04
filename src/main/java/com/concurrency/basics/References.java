package com.concurrency.basics;

public class References {

    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            System.out.println("My name is -> "+Thread.currentThread().getName());
        },"Lambda");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                //Referencing the current thread with Thread.currentThread
                System.out.println("My Name is -> "+Thread.currentThread().getName());
            }
        };
        Thread t2 = new Thread(runnable,"Anonymous");
        t1.start();
        t2.start();
    }
}
