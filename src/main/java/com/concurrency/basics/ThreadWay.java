package com.concurrency.basics;

public class ThreadWay extends Thread {

    public void run() {
        System.out.println("Running extended thread..");
    }

    public static void main(String[] args) {
        ThreadWay tw = new ThreadWay();
        tw.start();
    }
}
