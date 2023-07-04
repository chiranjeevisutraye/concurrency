package com.concurrency.basics;

public class Interruptions {

    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("I just started and going to sleep");
                try {
                    Thread.sleep(2000); // Thread interrupting itself by going to sleep
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Woke up now and terminating");
            }
        };
        Thread t = new Thread(r,"Interrupting Thread");
        t.start();
    }
}
