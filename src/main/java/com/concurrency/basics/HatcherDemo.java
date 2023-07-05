package com.concurrency.basics;

public class HatcherDemo {

    public static void main(String[] args) throws InterruptedException {
        Hen hen = new Hen();
        Hatcher hatcher = new Hatcher(hen);
        Collector collector = new Collector(hen);

        Thread t1 = new Thread(hatcher,"Hatcher");
        Thread t2 = new Thread(collector,"Collector");

        Thread t3 = new Thread(hatcher,"Hatcher1");
        Thread t4 = new Thread(collector,"Collector1");
        t1.start();
        t2.start();

        t1.join();
        t2.join();


        System.out.println("Produced->"+hen.getProduced());
        System.out.println("Collected->"+hen.getCollected());
    }
}
