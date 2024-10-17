package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Aula13Exercicio11 {
    /*Faça um programa que peça 2 números inteiros e um número real.
    * Calcule e mostre:
    *   a) O produto do dobro do primeiro com metade do segundo
    *   b) A soma do triplo do primeiro com o terceiro.
    *   c) O terceiro elevado ao cubo.
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("BRINCANDO COM OS NÚMEROS");
        System.out.println("digite dois números inteiros: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("O produto do dobro do primeiro com metade do segundo");
        double resultadoA = (num1 * 2) * (num2 / 2);
        System.out.println("Resposta: "+ resultadoA);
        System.out.println("Digite um número real (número com casa decimal)");
        double num4 = sc.nextDouble();
        System.out.println("A soma do triplo do primeiro com o terceiro.");
        double resultadoB = (num1 * 3) + num4;
        System.out.println("Resposta: " + resultadoB);
        System.out.println("O terceiro elevado ao cubo");
//        double resultdo3 = num4 * num4 * num4;
        double resultdo3 = Math.pow(num4, 3);
        System.out.println("Resposta " + resultdo3);

    }
}
