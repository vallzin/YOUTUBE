package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Aula13Exercicio10 {
    /*Faça um programa que peça a temperatura em graus Celsius,
    * transforme e mostre em graus Farenheit
    * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CELSIUS para FARENHEIT");
        System.out.println("Digite a medida em graus Celsius: ");
        double medidaCelsius = sc.nextDouble();
        double medidaFaren = ((medidaCelsius * 1.8) + 32);
        System.out.printf(" %.2f graus Celsius equivalem a %.2f Farenheint", medidaCelsius, medidaFaren);
    }

}
