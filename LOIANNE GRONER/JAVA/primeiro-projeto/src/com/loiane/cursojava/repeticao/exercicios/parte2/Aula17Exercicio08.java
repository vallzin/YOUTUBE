package com.loiane.cursojava.repeticao.exercicios.parte2;


import java.util.Scanner;

public class Aula17Exercicio08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        int soma = 0;
        double media;
        for (int i = 1; i <= 5; i++){
            System.out.print("digite um número:");
            num = sc.nextInt();
            soma += num;
            System.out.println("A soma dos números é "+ soma);
            media = (double) soma / i;
            System.out.println("A média dos números é "+ media);

        }
    }
}

