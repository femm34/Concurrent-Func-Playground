package org.example;

public class Exercices implements Runnable {
    @Override
    public void run(){

        System.out.println("First message");
        System.out.println(Thread.currentThread().getName());
        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Second message");
    }
}
