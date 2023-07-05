package com.concurrency.basics;

public class Hen {
    private int collected=0;
    private int produced = 0;
    private volatile boolean hatched=false;

    public synchronized void hatch() throws InterruptedException {
        ++produced;
        hatched=true;
        notifyAll();
        System.out.println(Thread.currentThread().getName()+"-- Hatched and waiting to collect "+ produced);
        wait(50);
        System.out.println(Thread.currentThread().getName()+"-- Wait is over");
    }

    public synchronized void collect() {
        ++collected;
        hatched=false;
        notifyAll();
        try {
            System.out.println(Thread.currentThread().getName()+"-- Collected and waiting to hatch --"+collected);
            wait(50);
            System.out.println(Thread.currentThread().getName()+"-- Wait is over");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public int getCollected() {
        return collected;
    }

    public int getProduced() {
        return produced;
    }
}
