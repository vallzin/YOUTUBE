package com.loiane.cursojava.arrays.exercicios.parte3;

import java.util.Scanner;

public class Aula19Exercicio23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[10];


        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite os valor do array na "+i+" posição : ");
            vetorA[i] = sc.nextInt();

            if(vetorA[i] % 2 != 0){
                System.out.println("Número ímpar");
                break;
            }

        }

    }

}
