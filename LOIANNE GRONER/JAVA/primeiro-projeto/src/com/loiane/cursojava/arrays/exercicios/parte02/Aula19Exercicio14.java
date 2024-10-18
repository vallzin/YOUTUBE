package com.loiane.cursojava.arrays.exercicios.parte02;

import java.util.Scanner;

public class Aula19Exercicio14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++){
            System.out.print("Digite o valor do array na posição (" + i+") ");
            vetorA[i] = sc.nextInt();
        }
        double somaValores = 0;
        int qtdImpares = 0;

        for (int i = 0; i < vetorA.length; i++){
            if(vetorA[i] % 2 != 0){
                somaValores += vetorA[i];
                qtdImpares++;
            }
        }

        double media = somaValores / qtdImpares;

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("A soma dos valores ímpares é " + somaValores);
        System.out.println("A quantidade de valores ímpares é "+qtdImpares);
        System.out.println("A média dos valores ímpares é "+ media);

    }

}
