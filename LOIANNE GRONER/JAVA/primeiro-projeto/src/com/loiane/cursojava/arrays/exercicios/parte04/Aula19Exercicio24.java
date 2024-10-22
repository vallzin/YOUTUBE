package com.loiane.cursojava.arrays.exercicios.parte04;

import java.util.Scanner;

public class Aula19Exercicio24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[10];
        for (int i = 0; i < vetorA.length; i++){
            System.out.print("Digite os valores do vetor: ");
            vetorA[i] = sc.nextInt();
        }

        boolean palindromo = true;
        for (int i = 0; i < (vetorA.length / 2); i++){
            if(vetorA[i] != vetorA[vetorA.length - 1 - i]){
                palindromo = false;
                break;
            }
        }

        System.out.println();
        System.out.print("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        if (palindromo){
            System.out.println("É palíndromo");
        }else {
            System.out.println("Não é palíndromo");
        }

    }

}
