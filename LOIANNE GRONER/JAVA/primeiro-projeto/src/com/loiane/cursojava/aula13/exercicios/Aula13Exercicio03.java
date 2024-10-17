package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Aula13Exercicio03 {
    public static void main(String[] args) {
        /*
        * 03) Faça um programa que peça dois números
        * e imprima a soma.
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite dois números inteiros: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        int resultado = num1 + num2;
        System.out.println("A soma dos números é "+ resultado);
    }
}
