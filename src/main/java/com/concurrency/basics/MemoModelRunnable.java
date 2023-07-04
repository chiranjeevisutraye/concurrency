package com.concurrency.basics;

public class MemoModelRunnable implements Runnable{
    Object myObject = null;
    MemoModelRunnable(Object myObject) {
        //local variable for thread, when passed same object for different threads
        //threads will reference to the same object in the heap
        this.myObject=myObject;
    }
    public void run() {
        System.out.println("Printing object from Thread Name->"+
                Thread.currentThread().getName()+"--"+myObject);
    }
}
