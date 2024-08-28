package org.example;

import org.implRunnable.ImplRunnable;

public class Concurrency {
    public Thread thread(){
        return new Thread(new ImplRunnable());
    };
}
