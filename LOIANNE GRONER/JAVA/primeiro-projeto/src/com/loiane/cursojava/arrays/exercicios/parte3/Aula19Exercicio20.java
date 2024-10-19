package com.loiane.cursojava.arrays.exercicios.parte3;

import java.util.Scanner;

public class Aula19Exercicio20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] vetorA = new double[20];
        double cotacao;

        System.out.print("Digite a contação do dolar: ");
        cotacao = sc.nextDouble();

        for (int i = 0; i < vetorA.length; i++){
            vetorA[i] = cotacao * (i + 1);
        }

        System.out.println("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.println(vetorA[i] + " ");
        }
        System.out.println();

    }

}
