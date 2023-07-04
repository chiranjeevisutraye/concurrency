package com.concurrency.basics;

public class RaceRunnableDemo {
    public static void main(String[] args) {
        RaceRunnable raceRunnable1 = new RaceRunnable();
        //RaceRunnable raceRunnable2 = new RaceRunnable();

        Thread t1 = new Thread(raceRunnable1);
        Thread t2 = new Thread(raceRunnable1);

        t1.start();
        t2.start();

    }
}
