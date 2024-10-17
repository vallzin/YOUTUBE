package com.loiane.cursojava.arrays.exercicios.parte01;

import java.util.Scanner;

public class Aula19Exercicio02 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] vetorA = new int[8];
    int[] vetorB = new int[vetorA.length];

    for(int i = 0; i < vetorA.length; i++){

        System.out.println("digite o valor da posição: " + i);
        vetorA[i] = sc.nextInt();

        vetorB[i] = vetorA[i] * 2;
    }

    //outra forma de acrecentar o vetorA em vetorB
//    for (int i = 0; i < vetorB.length; i++){
//        vetorB[i] = vetorA[i] * 2;
//    }

    System.out.print("Vetor A = ");
    for (int i = 0; i < vetorA.length; i++){
        System.out.print(vetorA[i] + " ");
    }
    System.out.println();

    System.out.print("Vetor B = ");
    for (int i = 0; i < vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
    }
    System.out.println();

    }

}
