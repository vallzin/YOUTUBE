package com.loiane.cursojava.arraymultidimensional.exercicios;

import java.util.Random;

public class Aula20Exercicio02 {
    public static void main(String[] args) {
        int [][] numAleatorio = new int[10][10];

        Random numRadom = new Random();

        for (int i = 0; i < numAleatorio.length; i++){
            for (int j = 0; j < numAleatorio[i].length; j++){
                numAleatorio[i][j] = numRadom.nextInt(100);
            }
        }

        int menorLinha5 = Integer.MAX_VALUE;
        int maiorLinha5 = Integer.MIN_VALUE;
        int menorColuna7 = Integer.MAX_VALUE;
        int maiorColuna7 = Integer.MIN_VALUE;

//        for (int i = 0; i < numAleatorio.length; i++){
//            for(int j = 0; j < numAleatorio[i].length; j++){
//                if (numAleatorio[5][j] < menorLinha5){
//                    menorLinha5 = numAleatorio[4][j];
//                }
//                if (numAleatorio[5][j] > maiorLinha5){
//                    maiorLinha5 = numAleatorio[4][j];
//                }
//                if (numAleatorio[i][7] < menorColuna7){
//                    menorColuna7 = numAleatorio[i][7];
//                }
//                if (numAleatorio[i][7] > maiorColuna7){
//                    maiorColuna7 = numAleatorio[i][7];
//                }
//
//            }
//        }
        for(int i = 0; i < numAleatorio[5].length; i++){
            if (numAleatorio[5][i] < menorLinha5){
                menorLinha5 = numAleatorio[5][i];
            }
            if (numAleatorio[5][i] > maiorLinha5){
                maiorLinha5 = numAleatorio[5][i];
            }
        }

        for(int i = 0; i < numAleatorio.length; i++){
            if (numAleatorio[i][7] < menorColuna7){
                menorColuna7 = numAleatorio[i][7];
            }
            if (numAleatorio[i][7] > maiorColuna7){
                maiorColuna7 = numAleatorio[i][7];
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
        System.out.println("Menor valor linha 5= " + menorLinha5);
        System.out.println("Maior valor linha 5= " + maiorLinha5);
        System.out.println("Menor valor coluna 7 = " + menorColuna7);
        System.out.println("Maior valor coluna 7 = " + maiorColuna7);


    }
}
