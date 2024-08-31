package org.example;

public class ConcurrencyTen implements Runnable {
    public void run(){
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            Thread.yield();
        }
    }
}
