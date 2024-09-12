package org.example;

import java.awt.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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


//        ExecutorService executor = Executors.newCachedThreadPool();
//        for (int i = 0; i < 5; i++) {
//            executor.execute(new mapEx());
//        }
//
//        executor.shutdown();
//        try {
//            // Esperar a que todos los hilos terminen
//            if (!executor.awaitTermination(3, TimeUnit.SECONDS)) {
//                executor.shutdownNow();
//            }
//        } catch (InterruptedException e) {
//            executor.shutdownNow();
//            Thread.currentThread().interrupt();
//        }

//        ExecutorService executorService = Executors.newCachedThreadPool();
//        for (int i = 0; i < 10; i++) {
//            executorService.execute(new reduceEx());
//        }
//        executorService.shutdown();

//        ExecutorService executorService = Executors.newCachedThreadPool();
//        executorService.execute(new dobles());
//        executorService.shutdown();
//        SumCalculator cal = (x,y) -> x + y;
//        var result = cal.sum(45,5);
//        System.out.println(result);

//          isEmptyString verify = (s)-> s.isEmpty();
//            var result = verify.isEmptysss("asd");
//        System.out.println(result);

//        ExecutorService executorService = Executors.newCachedThreadPool();
//        executorService.execute(new Multiply());
//        executorService.shutdown();

//        Thread convertString = new Thread(new ConvertString());
//        convertString.start();

//        EvenOdd even = n-> n % 2 ==0;
//
//        var result = even.filterEvenOdd(3);
//        System.out.println(result);

//        Predicate<Integer> lesserThanTen = (n)-> n < 10;
//        System.out.println(lesserThanTen.test(10));

//            FerPredicate lessThanTen = number -> number < 10;
//            System.out.println(lessThanTen.test(15));

//        HashMap<String, Integer> data = new HashMap<>();
//        data.put("Fernando", 20);
//        data.put("Elia Sandra", 19);
//        data.put("Carlos Montiel",28);

//        System.out.println(String.format("La edad de Fernando es %", data.get("Fernando")));
//        System.out.println(data);
//        for(var si : data.entrySet()){
//            System.out.println(si.getKey());
//        }
//        UserRepository userRepository = new mySQLRepository();
//        UserService userService = new UserService(userRepository);


//        ProductRepository productRepository = new mySQLRepository();
//        ProductService productService = new ProductService(productRepository);
//        productService.findAllProducts();

//        Operation cal = (x,y) -> x + y;

//        var ola = cal.apply(2,4);


//        Calc sum = (x,y) -> y + x;
//        double ola = sum.calc(3,3);
//        System.out.println(ola+6);


//        List<Integer> numeros = List.of(1,2,3,4,5);

//        Cola ola = (a) -> {
//            if(a.length() <= 0){
//                return true;
//            }
//            return false;
//        };
//        boolean result = ola.analize("asdas");
//        System.out.println(result);

//        Predicate<Integer> lesserThanTen = (n)-> n < 10;
//        System.out.println(lesserThanTen.test(10));

//        List<Integer> numerines = List.of(1,4,2,4,34,3,10);
//        Predicate<Integer> lessThanTen = n -> n < 10;
//
//        List<Integer> yeah= numerines.stream()
//                .filter(lessThanTen.negate())
//                .collect(Collectors.toList());
//
//        yeah.forEach(System.out::println);
//        System.out.println(yeah);


//        Predicate<Integer> isEven  = i -> i % 2 == 0;
//        List<Integer> numerines = List.of(1,2,4,41,12);
//
//        Integer sum = numerines.stream()
//                .filter(isEven)
//                .reduce(0, Integer::sum);
//
//
//        System.out.println(sum);


//        List<String> words = Arrays.asList("java", "functional", "programming");
//
//        var upperCaseWords = words.stream()
//                .map(String::toUpperCase)
//                .collect(Collectors.toList());
//
//        System.out.println(upperCaseWords);

//        Predicate<String> startsWithA = s -> s.charAt(0) == 'a' || s.charAt(0) == 'A';
//
//        List<String> names = Arrays.asList("Ana", "Pedro", "Alberto", "Beatriz", "Andrés");
//        var namesStartWithA = names.stream()
//                .filter(startsWithA)
//                .collect(Collectors.toList());
//        System.out.println(namesStartWithA);

//        List<Integer> numerines = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//        var sum = numerines.stream()
//                .max(Integer::compareTo);
//
//        sum.ifPresent(System.out::println);

        List<Integer> numbers = Arrays.asList(2, 3, 4, 5);

        var product = numbers.stream()
                .reduce(1, (accumulator,currentValue)->accumulator*currentValue);

        System.out.println(product);




    }
}
