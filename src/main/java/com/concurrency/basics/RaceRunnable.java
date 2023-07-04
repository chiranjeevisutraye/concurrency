package com.concurrency.basics;

public class RaceRunnable implements Runnable{
    private int count=0;
    @Override
    public void run() {
        for(int i=0;i<500000;++i) {
            synchronized (this){
                ++count;
            }
        }
        System.out.println(Thread.currentThread().getName()+" value->"+count);
    }
}
