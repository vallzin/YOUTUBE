package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Aula13Exercicio04 {
    public static void main(String[] args) {
        /*
        * 04) Faça um programa que peça as 4 notas bimestrais
        * e mostre a média.
        * */

        Scanner sc = new Scanner(System.in);

        System.out.println("Notas Bimeestrais");
        System.out.print("Insira a nota do primeiro bimestre: ");
        double nota1 = sc.nextDouble();
        System.out.print("Insira a nota do segundo bimestre: ");
        double nota2 = sc.nextDouble();
        System.out.print("Insira a nota do terceiro bimestre: ");
        double nota3 = sc.nextDouble();
        System.out.print("Insira a nota do quarto bimestre: ");
        double nota4 = sc.nextDouble();
        sc.close();

        double soma = nota1 + nota2 + nota3 + nota4;
        double media = soma / 4;
        System.out.println("A média é: " + media);




    }
}
