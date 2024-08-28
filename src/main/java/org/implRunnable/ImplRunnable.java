package org.implRunnable;

public class ImplRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("Thread in execution: " + Thread.currentThread().getName());
    }
}
