package org.implRunnable;

public class ImplRunnable implements Runnable{
    @Override
    public void run(){
        for (int i=0; i<5; i++){
            System.out.println("Thread in execution: " + Thread.currentThread().getName());
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }

    }
}
