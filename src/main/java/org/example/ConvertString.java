package org.example;

public class ConvertString implements Runnable{
    public void run(){
    convert converterToLower  = (string)-> string.toLowerCase();
    convert converterToUpper = (string)-> string.toUpperCase();
    convert converterToLowerUpper = (string)-> string.toLowerCase().toUpperCase();

    String lower = converterToLower
            .execute("HOLA QUE ONDA");
    String upper = converterToUpper
            .execute("HOLA QUE ONDA");
    String lowerUpper = converterToLowerUpper
            .execute("HOLA QUE ONDA");
    System.out.println(lower + " " + upper + " " + lowerUpper);
    };

}
