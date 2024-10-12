package com.loiane.cursojava.repeticao.exercicios;


import java.util.Scanner;

public class Aula17Exercicio32 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Fatorial de: ");
        int fat = sc.nextInt();

        int total = 1;
        System.out.print(" " + fat+"! "+"= ");
        for (int i = fat; i > 1; i--){
            total *= i;
            System.out.print(i + " * ");

        }

        System.out.print("1  = "+total);
    }
}

