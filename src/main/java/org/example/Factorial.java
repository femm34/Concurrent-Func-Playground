package org.example;

public class Factorial extends Thread {
    private int n;

    public Factorial(int n) {
        this.n = n;
    }

    public void run() {
        Integer result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " - Interrumpido durante el cálculo del factorial.");
                return;
            }
        }
        System.out.println("Factorial of " + n + " is " + result);
    }
}
