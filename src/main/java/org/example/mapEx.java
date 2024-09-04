package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class mapEx implements Runnable{
    public void run() {
        List<Integer> numeros = List.of(1,2,3,4,5);
        var cuadrado = numeros.stream().map((n)->n*n).collect(Collectors.toList());
        System.out.println(cuadrado);
    }
}
