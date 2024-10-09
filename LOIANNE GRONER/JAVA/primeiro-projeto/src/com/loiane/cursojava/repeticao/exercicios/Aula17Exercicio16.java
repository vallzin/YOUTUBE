package com.loiane.cursojava.repeticao.exercicios;


import java.util.Scanner;

public class Aula17Exercicio16 {
    public static void main(String[] args) {

        System.out.println("Série Fibonacci");

        int prim = 1;
        int segu = 1;
        int prox = 0;
        while (prox < 500){

            prox = prim + segu;
            prim = segu;
            segu = prox;

            System.out.println(prox);
       }


    }
}

