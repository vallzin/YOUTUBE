package com.loiane.cursojava.repeticao.exercicios;


import java.util.Scanner;

public class Aula17Exercicio07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        int maior = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++){
            System.out.println("digite um número:");
            num = sc.nextInt();
            if (num > maior){
                maior = num;
                System.out.print("O maior número é " + maior);
            }
        }
        System.out.print("O maior número digitado foi: "+ maior);
    }
}

