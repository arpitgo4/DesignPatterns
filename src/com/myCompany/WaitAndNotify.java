package com.myCompany;

/**
 * Created by arpit on 7/2/16.
 */
public class WaitAndNotify {

    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
    }




    /*public WaitAndNotify() {
        t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Thread 2. . . .");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.notify();
            }
        });


        t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (this) {
                    System.out.println("Hello In Thread 1 . . . .");
                    try {
                        t2.start();
                        this.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println("After Waiting in Thread 1 . . . .");
                }
            }
        });
    }*/
}
