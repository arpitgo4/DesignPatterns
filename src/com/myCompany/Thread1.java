package com.myCompany;

/**
 * Created by arpit on 8/2/16.
 */
public class Thread1 extends Thread {

    @Override
    public void run() {
        super.run();
        synchronized (this) {
            System.out.println("Inside Thread 1");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
