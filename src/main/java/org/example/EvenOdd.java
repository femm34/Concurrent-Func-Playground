package org.example;

import java.util.function.Predicate;

@FunctionalInterface
public interface EvenOdd {
    boolean filterEvenOdd(Integer number);
}
