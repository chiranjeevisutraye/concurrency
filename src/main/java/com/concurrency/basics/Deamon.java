package com.concurrency.basics;

public class Deamon {

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(()->{
            System.out.println("I am a deamon thread");
                try {
                    for(int i=0;i<10;++i) {
                        Thread.sleep(500);
                        System.out.println("...");
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
        });
        //If this isn't set the thread will be running even after mainThread/JVM exited
        t.setDaemon(true);
        t.start();
        //Thread.sleep(5000); // Sleeping main thread for 5 seconds
        t.join(); //wait until the thread `t` execution completes
        System.out.println("Main Thread exiting..");
    }
}
