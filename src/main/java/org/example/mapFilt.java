package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class mapFilt implements Runnable{
    public void run(){

        List<String> palabras = List.of("casa","automóvil","sol","bicicleta","gato");
        List<String> resultado = palabras.stream()
                .filter(e->e.length() > 4)
                .collect(Collectors.toList());
        System.out.println(resultado);
    }
}
