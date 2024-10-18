package com.loiane.cursojava.arrays.exercicios.parte02;

import java.util.Scanner;

public class Aula19Exercicio11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++){
            System.out.print("Digite o valor do array na posição " + i+" ");
            vetorA[i] = sc.nextInt();
        }
        int qtdPares = 0;
        for (int i = 0; i < vetorA.length; i++){
            if(vetorA[i] % 2 == 0){
                System.out.println("O valor " + vetorA[i]+" é par.");
                qtdPares += 1;
            }
        }

        System.out.print("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i]+" ");
        }
        System.out.println("\nA quantidade de pares no array é "+ qtdPares);
    }
}
