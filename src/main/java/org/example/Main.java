package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


class MyThread  extends Thread {
    public void run() {
        System.out.println("Hilo en ejecución: " + Thread.currentThread().getName());
    }
}
public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        var myThread2 = new MyThread();
        var myThread3 = new MyThread();
        myThread.start();
        myThread2.start();
        myThread3.start();

    }
}