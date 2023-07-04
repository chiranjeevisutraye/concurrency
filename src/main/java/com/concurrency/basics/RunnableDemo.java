package com.concurrency.basics;

public class RunnableDemo {
    public static void main(String[] args) {
        /*MyRunnable runnable = new MyRunnable();
        //Runnable can be passed to a thread and when the thread
        //starts it executes the `run` method inside the runnable.
        Thread t1 = new Thread(runnable,"T1");
        t1.start();*/

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("I am anonymous runnable");
            }
        };
        Thread t1 = new Thread(runnable,"Anonymous");
        Thread t2 = new Thread(()->{
            System.out.println("I am lambda runnable");
        },"Lambda");
        t1.start();
        t2.start();
    }
}
