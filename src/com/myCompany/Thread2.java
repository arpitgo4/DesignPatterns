package com.myCompany;

/**
 * Created by arpit on 8/2/16.
 */
public class Thread2 extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("Inside Thread 2");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notify();
    }
}
