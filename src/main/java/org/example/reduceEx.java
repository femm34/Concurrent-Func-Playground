package org.example;

import java.util.List;

public class reduceEx implements Runnable{
    @Override
    public void run() {
        List<Integer> numeritos = List.of(12,4,54,12,54,1);
//        Integer sumaaa = numeritos.stream().reduce(0,Integer::sum);
//        Integer suma = Integer.sum(7,213);
//        System.out.println(suma);
        Integer sumaaa = numeritos.stream()
                .reduce(0, Integer::sum);
        System.out.println(sumaaa);
    }
}
