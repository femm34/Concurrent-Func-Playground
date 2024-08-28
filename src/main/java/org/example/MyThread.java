package org.example;

public class MyThread extends Thread {
    public void run(){
        System.out.println("Thread in execution: " + Thread.currentThread().getName());
    }
}
