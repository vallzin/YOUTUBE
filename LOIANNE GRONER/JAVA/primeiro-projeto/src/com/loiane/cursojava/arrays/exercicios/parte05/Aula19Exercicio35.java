package com.loiane.cursojava.arrays.exercicios.parte05;

import java.util.Scanner;

public class Aula19Exercicio35 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++){
            System.out.print("Digite os valores do vetor A: ");
            vetorA[i] = sc.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Divisores de "+vetorA[i]);
            for (int j = 1; j <= vetorA[i]; j++){
                if (vetorA[i] % j == 0){
                    System.out.println(j + " é dividor");
                }
            }
        }
    }
}
