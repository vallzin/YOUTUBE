package com.loiane.cursojava.arrays.exercicios.parte05;

import java.util.Scanner;

public class Aula19Exercicio30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++){
            System.out.print("Digite os valores do vetor A: ");
            vetorA[i] = sc.nextInt();
        }

        int posB = 0;
        int posC = 0;

        for (int i = 0; i < vetorA.length; i++){
            if(vetorA[i] % 2 == 0){
                vetorB[posB] = vetorA[i];
                posB++;
            }else {
                vetorC[posC] = vetorA[i];
                posC++;
            }
        }

        System.out.println();
        System.out.print("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i]+" ");
        }

        System.out.println();
        System.out.print("Vetor B: ");
        for (int i = 0; i < posB; i++){
            System.out.print(vetorB[i]+" ");
        }

        System.out.println();
        System.out.print("Vetor C: ");
        for (int i = 0; i < posC; i++){
            System.out.print(vetorC[i]+ " ");
        }

    }

}
