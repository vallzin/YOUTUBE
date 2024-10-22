package com.loiane.cursojava.arrays.exercicios.parte05;

import java.util.Scanner;

public class Aula19Exercicio32 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[5];

        for (int i = 0; i < vetorA.length; i++){
            System.out.print("Digite os valores do vetor A: ");
            vetorA[i] = sc.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Tabuada de "+vetorA[i]);
            for (int j = 1; j <= 10; j++){
                System.out.println(j +" + "+vetorA[i]+" = "+(i + j));
            }
            System.out.println();
        }
    }
}
