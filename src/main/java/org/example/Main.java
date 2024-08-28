package org.example;
public class Main {
    public static void main(String[] args) {
        System.out.println("Threads and functional programming in java");
        System.out.println("--------------------");
        Thread hi = new Concurrency().thread();
        Thread bye = new Concurrency().thread();
        Thread idk = new Concurrency().thread();
        MyThread tbt = new MyThread();
        tbt.start();
//        Thread ok = new Thread();
        hi.start();
        bye.start();
        idk.start();
//        System.out.println(ok.getName());
//        ok.getName();
    }
}
