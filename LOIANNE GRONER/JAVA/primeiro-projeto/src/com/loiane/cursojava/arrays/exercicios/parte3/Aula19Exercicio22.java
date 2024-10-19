package com.loiane.cursojava.arrays.exercicios.parte3;

import java.util.Scanner;

public class Aula19Exercicio22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[10];

        int qtd0 = 0;
        int qtd1 = 0;
        for (int i = 0; i < vetorA.length; i++){
            vetorA[i] = (int) Math.round(Math.random()*1);

            if (vetorA[i] == 0){
                qtd0++;
            }else {
                qtd1++;
            }
        }

        double porc0 = (double) (qtd0 * 100) / vetorA.length;
        double porc1 = (double) (qtd1 * 100) / vetorA.length;

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("Porcentagem de zeros: "+porc0+"%");
        System.out.println("Porcentagem de uns: "+porc1+"%");



    }

}
