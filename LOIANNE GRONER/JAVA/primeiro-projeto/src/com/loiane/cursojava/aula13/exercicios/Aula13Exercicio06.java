package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Aula13Exercicio06 {
    public static void main(String[] args) {
        /*
         * Faça um programa que peça o raio de um círculo,
         * calcule e mostre sua área.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("********* ÁREA DO CÍRCULO *******");
        System.out.print("Digite o comprimento do raio: ");
        double raio = sc.nextDouble();
        sc.close();
//        double PI = 3.1415f;
//        double area = PI * (raio * raio);
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("A área do círculo é: " + area);

    }
}
