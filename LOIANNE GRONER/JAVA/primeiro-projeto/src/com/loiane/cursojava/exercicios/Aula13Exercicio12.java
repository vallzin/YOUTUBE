package com.loiane.cursojava.exercicios;

import java.util.Scanner;
import java.util.Locale;

public class Aula13Exercicio12 {
    /*
    Tendo como dados de entrada a altura de uma pessoa,
    construa um algoritmo que calcule seu peso ideal,
    usando a seguinte fórmula: (72.7*altura) - 58
    */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("*************** PESO IDEAL ***************");
        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();
        double pesoIdeal = ((72.7 * altura) - 58);
        System.out.printf("O peso ideal para sua altura é %.2f", pesoIdeal);
    }
}
