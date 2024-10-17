package com.loiane.cursojava.aula13.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Aula13Exercicio13 {
    /*
    Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal,
    utilizando as seguintes fórmulas:
        a) Para homens: (72.7*h) - 58
        b) Para mulheres: (62.1*h) - 44.7
    * */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("<===> Calculando peso ideal <===>");
        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();
        double pesoIdealHomens = (72.2 * altura) - 58;
        double pesoIdealMulheres = (62.1 * altura) - 44.7;
        System.out.printf("O peso ideal homens: %.2f e o peso ideal mulheres: %.2f", pesoIdealHomens, pesoIdealMulheres);



    }
}
