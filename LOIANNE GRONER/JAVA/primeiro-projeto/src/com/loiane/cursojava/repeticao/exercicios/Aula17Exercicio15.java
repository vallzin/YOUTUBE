package com.loiane.cursojava.repeticao.exercicios;


import java.util.Scanner;

public class Aula17Exercicio15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Série Fibonacci");
        System.out.print("Digite um número: ");
        int n = sc.nextInt();


        int prim = 1;
        int segu = 1;
        int prox;
        for (int i = 3; i <= n; i++){
            prox = prim + segu;
            prim = segu;
            segu = prox;

            System.out.println(prox);
       }


    }
}

