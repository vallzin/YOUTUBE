package com.loiane.cursojava.repeticao.exercicios;


import java.util.Scanner;

public class Aula17Exercicio17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Fatorial '!n'");
        System.out.print("Digite um número inteiro:");
        int n = sc.nextInt();

        int fat = 1;
//        for (int i = 1; i <= n; i++){
//            fat *= i;
//        }

        for (int i = n; i > 0; i--){
            fat *= i;
            System.out.print(" " + i );
        }
        System.out.println("\nO fatorial de "+ n + " é "+ fat);


    }
}

