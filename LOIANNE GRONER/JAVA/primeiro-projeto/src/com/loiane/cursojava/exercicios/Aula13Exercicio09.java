package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class Aula13Exercicio09 {
    /*
    Faça um programa que peça a temperatura em graus Farenheit,
    trnsforme e mostre a temperatura em graus Celsius
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Transformar Farenheit para Celsius");
        System.out.print("Digite a temperatura em Farenheit: ");
        double medidaFaren = sc.nextDouble();
        double medidaCelsius = (5 * (medidaFaren - 32) / 9);
        System.out.printf(" %.2f  graus Farenheit equivalem a %.2f graus Celsius",medidaFaren, medidaCelsius);
    }

}
