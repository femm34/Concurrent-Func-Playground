package org.example;

import java.util.Random;

public class ConcurrencyFive implements Runnable{
    Random rand = new Random();
    public void run(){
        try{
            Thread.sleep(rand.nextInt(3000));
            System.out.println(Thread.currentThread().getState());
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
