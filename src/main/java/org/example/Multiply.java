package org.example;

public class Multiply implements  Runnable{
    @Override
    public void run() {
        MultiplyCalculator multiplyCalculator = (x, y)-> x * y;
        double result = multiplyCalculator.multiply(10,20);
        System.out.println(result);
    }
}
