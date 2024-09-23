package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class Aula13Exercicio06 {
    public static void main(String[] args) {
        /*
         * Faça um programa que peça o raio de um círculo,
         * calcule e mostre sua área.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Área do Círculo");
        System.out.print("Digite o comprimento do raio: ");
        float raio = sc.nextFloat();
        sc.close();
        float PI = 3.1415f;
        float area = PI * (raio * raio);
        System.out.println("A área do círculo é: " + area);

    }
}
