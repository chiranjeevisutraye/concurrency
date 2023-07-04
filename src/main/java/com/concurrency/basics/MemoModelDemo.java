package com.concurrency.basics;

public class MemoModelDemo {
    public static void main(String[] args) throws InterruptedException {
        //Since two threads are having different objects of runnables
        // and Objects are also differnt they will be referencing to
        //two different Heap Objects.
        Thread t1 = new Thread(new MemoModelRunnable(new Object()),"T1");
        Thread t2 = new Thread(new MemoModelRunnable(new Object()),"T2");
        t1.start();
        t1.join();
        t2.start();

        // The threads T3 and T4 share the same runnable object hence
        // They both will be referencing to same heap object
        MemoModelRunnable memRunnable = new MemoModelRunnable(new Object());
        Thread t3 = new Thread(new MemoModelRunnable(new Object()),"T3");
        Thread t4 = new Thread(new MemoModelRunnable(new Object()),"T4");
        t3.start();
        t4.start();

        //Since two threads are having different objects of runnables
        // but same object param, hence they will be referencing to
        //same Heap Objects.
        Object myObject = new Object();
        Thread t5 = new Thread(new MemoModelRunnable(myObject),"T5");
        Thread t6 = new Thread(new MemoModelRunnable(myObject),"T6");
        t5.start();
        t6.start();
    }
}
