package com.loiane.cursojava.arraymultidimensional.exercicios;

import java.util.Scanner;

public class Aula20Exercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [][] numMatriz = new int[3][3];

        for (int i = 0; i < numMatriz.length; i++){
            for (int j = 0; j<numMatriz[i].length; j++) {
                System.out.print("digite os números da posição [" + i +","+ j+"] : ");
                numMatriz[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        for (int i = 0; i < numMatriz.length; i++){
            for(int j = 0; j < numMatriz[i].length; j++){
                System.out.print(" " + numMatriz[i][j]+" ");
            }
            System.out.println();
        }

        int qtdPares = 0;
        int qtdImpares = 0;
        for (int i = 0; i < numMatriz.length; i++){
            for(int j = 0; j < numMatriz[i].length; j++) {
                if (numMatriz[i][j] % 2 == 0) {
                    qtdPares++;
                } else {
                    qtdImpares++;
                }
            }
        }

        System.out.println();
        System.out.println("Quantidade números pares = " + qtdPares);
        System.out.println("Quantidade números ímpares = " + qtdImpares);

    }
}
