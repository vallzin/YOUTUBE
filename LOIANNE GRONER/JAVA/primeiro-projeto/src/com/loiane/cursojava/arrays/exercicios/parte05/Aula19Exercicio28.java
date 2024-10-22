package com.loiane.cursojava.arrays.exercicios.parte05;

import java.util.Scanner;

public class Aula19Exercicio28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++){
            System.out.print("Digite os valores do vetor A: ");
            vetorA[i] = sc.nextInt();

            vetorB[vetorA.length - i - 1] = vetorA[i];
        }

        System.out.println();
        System.out.print("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i]+" ");
        }

        System.out.println();
        System.out.print("Vetor B: ");
        for (int i = 0; i < vetorB.length; i++){
            System.out.print(vetorB[i]+" ");
        }

    }

}
