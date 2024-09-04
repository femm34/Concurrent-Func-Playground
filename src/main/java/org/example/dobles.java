package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class dobles implements Runnable{
    public void run() {
        Integer[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        var si = Arrays.stream(numeros).count();
        System.out.println(si);
        var dobles = Arrays.stream(numeros)
                .map(Integer::doubleValue)
                .collect(Collectors.toList());
//        dobles.add(23);
        System.out.println(dobles);
    }
}
