package com.loiane.cursojava.repeticao.exercicios.parte2;


import java.util.Scanner;

public class Aula17Exercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número:");
        int num2 = sc.nextInt();

        for (int i = num1; i <= num2; i++){
            System.out.println(i);
        }

    }
}

