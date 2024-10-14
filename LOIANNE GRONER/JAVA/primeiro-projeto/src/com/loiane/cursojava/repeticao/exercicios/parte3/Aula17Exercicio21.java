package com.loiane.cursojava.repeticao.exercicios.parte3;


import java.util.Scanner;

public class Aula17Exercicio21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num = sc.nextInt();

        boolean ehPrimo = true;

        for (int i = 2; i < num; i++){
            if(num % i == 0){
                System.out.println("Não é primo, divisível por "+i);
                ehPrimo = false;
            }
        }

        if(ehPrimo){
            System.out.println("É número primo");
        }

    }
}

