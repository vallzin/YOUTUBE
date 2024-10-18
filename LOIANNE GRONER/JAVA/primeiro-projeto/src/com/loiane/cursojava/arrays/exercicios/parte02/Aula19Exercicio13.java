package com.loiane.cursojava.arrays.exercicios.parte02;

import java.util.Scanner;

public class Aula19Exercicio13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++){
            System.out.print("Digite o valor do array na posição " + i+" ");
            vetorA[i] = sc.nextInt();
        }
        int somaValores = 0;
        for (int i = 0; i < vetorA.length; i++){
            if(vetorA[i] % 5 == 0){
                somaValores += vetorA[i];
            }
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println("\nA soma dos valores do array é "+ somaValores);

    }

}
