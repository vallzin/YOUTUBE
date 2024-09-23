package com.loiane.cursojava.exercicios;

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
        double priBi = sc.nextDouble();
        System.out.print("Insira a nota do segundo bimestre: ");
        double segBi = sc.nextDouble();
        System.out.print("Insira a nota do terceiro bimestre: ");
        double terBi = sc.nextDouble();
        System.out.print("Insira a nota do quarto bimestre: ");
        double qrtBi = sc.nextDouble();
        sc.close();

        double soma = priBi + segBi + terBi + qrtBi;
        double media = soma / 4;
        System.out.println("A média Bimestral é: " + media);




    }
}
