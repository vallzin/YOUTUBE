package com.loiane.cursojava.repeticao.exercicios;


import java.util.Scanner;

public class Aula17Exercicio11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número:");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo número:");
        int num2 = sc.nextInt();

        int soma = 0;
        for (int i = num1; i <= num2; i++){
            soma += i;
        }
        System.out.println("A soma dos números entre: "+num1
                +" e " + num2 + " é: " + soma);

    }
}

