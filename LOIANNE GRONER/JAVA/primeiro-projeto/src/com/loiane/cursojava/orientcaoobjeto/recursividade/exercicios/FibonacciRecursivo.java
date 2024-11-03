package com.loiane.cursojava.orientcaoobjeto.recursividade.exercicios;

public class FibonacciRecursivo {

    public static int fibonacci(int num){

        if (num < 2){
            return 1;
        }

        return fibonacci(num -1) + fibonacci(num - 2);

    }
}
