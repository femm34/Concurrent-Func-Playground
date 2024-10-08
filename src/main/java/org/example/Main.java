package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Threads and functional programming in java");
//        System.out.println("--------------------");
//        Thread hi = new Concurrency().thread();
//        Thread bye = new Concurrency().thread();
//        Thread idk = new Concurrency().thread();
//        MyThread tbt = new MyThread();
//        tbt.start();
//        Thread ok = new Thread();
//        hi.start();
//        try {
//            hi.join();
//        }catch(InterruptedException e){
//            e.printStackTrace();
//        }
//
//        bye.start();


//        Thread.yield();
//        System.out.println("Main thread finished execution");

//        idk.start();
//        System.out.println(ok.getName());
//        ok.getName();

//        Thread threadOne = new Thread(new Exercices());
//        Thread threadTwo = new Thread(new Exercices());
//        Thread threadThree = new Thread(new Exercices());
//        threadOne.start();
//        try{
//            threadOne.join();
//            threadTwo.start();
//            threadTwo.join();
//        }
//        catch (InterruptedException e){
//            e.printStackTrace();
//        }

//        threadThree.start();

//        Thread threadOne = new Thread(new ConcurrencyTen());
//        Thread threadTwo = new Thread(new ConcurrencyTen());
//        Thread threadThree = new Thread(new ConcurrencyTen());

//        threadOne.start();
//        threadTwo.start();
//        threadThree.start();


//        Thread threadOne = new Thread(new ConcurrencyFive());
//        Thread threadTwo = new Thread(new ConcurrencyFive());
//        Thread threadThree = new Thread(new ConcurrencyFive());
//
//        System.out.println(threadOne.getName() + " - Estado inicial: " + threadOne.getState());
//        System.out.println(threadTwo.getName() + " - Estado inicial: " + threadTwo.getState());
//        System.out.println(threadThree.getName() + " - Estado inicial: " + threadThree.getState());
//
//        threadOne.start();
//        threadTwo.start();
//        threadThree.start();
//
//        System.out.println(threadOne.getName() + " - Estado después de iniciar: " + threadOne.getState());
//        System.out.println(threadTwo.getName() + " - Estado después de iniciar: " + threadTwo.getState());
//        System.out.println(threadThree.getName() + " - Estado después de iniciar: " + threadThree.getState());
//
//        try {
//            threadOne.join();
//            threadTwo.join();
//            threadThree.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(threadOne.getName() + " - Estado final: " + threadOne.getState());
//        System.out.println(threadTwo.getName() + " - Estado final: " + threadTwo.getState());
//        System.out.println(threadThree.getName() + " - Estado final: " + threadThree.getState());

//        int a[]= {1,2,3,4};
//        System.out.println(a instanceof Object);
//
//        Thread sumThread = new Thread(new Sum());
//        Factorial factorial = new Factorial(5);
//
//        sumThread.start();
//
//
//        System.out.println(sumThread.getState());
//
//        try{
//            System.out.println("empieza pausa");
//            Thread.sleep(20000);
//            System.out.println("termina pausa");
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
//
//        sumThread.interrupt();
//
//        try{
//            sumThread.join();
//            factorial.start();
//            factorial.join();
//        }
//        catch (InterruptedException e){
//            e.printStackTrace();
//        }


        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 5; i++) {
            executor.execute(new Sum());
        }

        executor.shutdown();

    }
}
