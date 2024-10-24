package com.loiane.cursojava.arraymultidimensional.exercicios;

import java.util.Random;

public class Aula20Exercicio01 {
    public static void main(String[] args) {
        int [][] numAleatorio = new int[4][4];

        Random numRadom = new Random();

        for (int i = 0; i < numAleatorio.length; i++){
            for (int j = 0; j < numAleatorio[i].length; j++){
                numAleatorio[i][j] = numRadom.nextInt(100);
            }
        }
        int maior = Integer.MIN_VALUE;
        int linha = 0;
        int coluna = 0;

        for (int i = 0; i < numAleatorio.length; i++){
            for(int j = 0; j < numAleatorio[i].length; j++){
                if (numAleatorio[i][j] > maior){
                    maior = numAleatorio[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }

        System.out.println();
        for (int i = 0; i < numAleatorio.length; i++){
            for(int j = 0; j < numAleatorio[i].length; j++){
                System.out.print(" " + numAleatorio[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Maior valor = " + maior);
        System.out.println("Linha = " + linha );
        System.out.println("Coluna = " + coluna);

    }
}
