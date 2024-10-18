package com.loiane.cursojava.arrays.exercicios.parte02;

import java.util.Scanner;

public class Aula19Exercicio17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++){
            System.out.print("Digite a " + (i + 1)+"ª idade: ");
            vetorA[i] = sc.nextInt();
        }

        int idadeMaior35 = 0;
        for (int i = 0; i < vetorA.length; i++){
            if(vetorA[i] > 35){
                idadeMaior35++;
            }
        }


        System.out.println();
        System.out.println("Pessoas com idade maiores do que 35:  " + idadeMaior35);

    }

}
