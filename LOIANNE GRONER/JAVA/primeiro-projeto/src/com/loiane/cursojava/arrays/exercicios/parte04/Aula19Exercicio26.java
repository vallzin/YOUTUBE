package com.loiane.cursojava.arrays.exercicios.parte04;

import java.util.Scanner;

public class Aula19Exercicio26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorB.length];

        for (int i = 0; i < vetorA.length; i++){
            System.out.print("Digite os valores do vetor A: ");
            vetorA[i] = sc.nextInt();
            System.out.print("Digite os valores do vetor B: ");
            vetorB[i] = sc.nextInt();

            if(vetorA[i] > vetorB[i]){
                vetorC[i] = 1;
            } else if (vetorA[i] == vetorB[i]) {
                vetorC[i] = 0;
            }else {
                vetorC[i] = -1;
            }
//            vetorC[i] = (vetorA[i] > vetorB[i]) ? 1 : (vetorA[i] == vetorB[i]) ? 0 : -1;
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

        System.out.println();
        System.out.print("Vetor C: ");
        for (int i = 0; i < vetorC.length; i++){
            System.out.print(vetorC[i] + " ");
        }


    }

}
