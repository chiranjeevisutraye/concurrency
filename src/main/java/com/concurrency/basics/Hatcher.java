package com.concurrency.basics;

public class Hatcher implements Runnable{

    private Hen hen;
    public Hatcher(Hen hen) {
        this.hen=hen;
    }

    public void run() {
        for(int i=0;i<5000;++i) {
            try {
                hen.hatch();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Done with hatcher run");
        Thread.currentThread().stop();
    }
}
