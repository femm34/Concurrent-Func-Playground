package org.example;

public class Sum implements Runnable {
    public void run() {
        Integer sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " - Interrumpido durante la suma.");
                return;
            }
        }
        System.out.println("Sum is: " + sum);
    }
}
