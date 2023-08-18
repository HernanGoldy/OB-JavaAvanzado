package com.openBootcamp.factorial;

import java.util.stream.IntStream;

public class FactorialFuncional {

    public static void main(String[] args) {
        System.out.println(factorialFuncional(5));
    }

    public static int factorialFuncional(int numero) {

        return IntStream.rangeClosed(1, numero)
                .reduce(1, (a, b) -> a * b);
    }
}
