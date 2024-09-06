package org.example;

@FunctionalInterface
public interface FerPredicate<T> {
    boolean test(T n);
}
