package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Aula13Exercicio05 {
    public static void main(String[] args) {
        /*
        * 05) Faça um programa que converta metros para centímetros.
        * */

        Scanner sc = new Scanner(System.in);
        System.out.println("Converter centímetros para metros");
        System.out.print("Digite a medida em centímetros: ");
        double cent = sc.nextDouble();
        sc.close();
        double centPMetros = cent / 100;
        System.out.println(" " + cent + " equivalem a " + centPMetros + " metros");






    }
}
