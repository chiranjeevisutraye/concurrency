package com.concurrency.basics;

public class Collector implements Runnable{

    private Hen hen;
    public Collector(Hen hen) {
        this.hen=hen;
    }
    public void run() {
        for(int i=0;i<5000;++i) {
            hen.collect();
        }
        System.out.println("Done with collector run");
        Thread.currentThread().stop();
    }
}
