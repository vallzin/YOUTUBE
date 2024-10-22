package com.loiane.cursojava.arrays.exercicios.parte04;

import java.util.Scanner;

public class Aula19Exercicio25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        for (int i = 0; i < vetorA.length; i++){
            System.out.print("Digite os valores do vetor: ");
            vetorA[i] = sc.nextInt();

            vetorB[i] = (vetorA[i] % 2 == 0 ) ? 1 : 0;
        }

        System.out.println();
        System.out.print("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.print("Vetor B: ");
        for (int i = 0; i < vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }

    }

}
