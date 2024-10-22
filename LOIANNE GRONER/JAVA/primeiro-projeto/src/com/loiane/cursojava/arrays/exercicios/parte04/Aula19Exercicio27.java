package com.loiane.cursojava.arrays.exercicios.parte04;

import java.util.Scanner;

public class Aula19Exercicio27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[10];

//        char[] vetorB = new char[vetorA.length];
//        for (int i = 0; i < vetorA.length; i++){
//            System.out.print("Digite os valores do vetor A: ");
//            vetorA[i] = sc.nextInt();
//            if(vetorA[i] < 7){
//                vetorB[i] = 'a';
//            } else if (vetorA[i] == 7) {
//                vetorB[i] = 'b';
//            } else if (vetorA[i] > 7 && vetorA[i] <= 10) {
//                vetorB[i] = 'c';
//            } else if (vetorA[i] > 10) {
//                vetorB[i] = 'd';
//            }
//        }

//        String [] vetorB = new String[vetorA.length];
//        for (int i = 0; i < vetorA.length; i++){
//            System.out.print("Digite os valores do vetor A: ");
//            vetorA[i] = sc.nextInt();
//            if(vetorA[i] < 7){
//                vetorB[i] = "a";
//            } else if (vetorA[i] == 7) {
//                vetorB[i] = "b";
//            } else if (vetorA[i] > 7 && vetorA[i] <= 10) {
//                vetorB[i] = "c";
//            } else if (vetorA[i] > 10) {
//                vetorB[i] = "d";
//            }
//        }

        String[] vetorB = new String[vetorA.length];
        for (int i = 0; i < vetorA.length; i++){
            System.out.print("Digite os valores do vetor A: ");
            vetorA[i] = sc.nextInt();
            if(vetorA[i] < 7){
                vetorB[i] = String.valueOf('a');
            } else if (vetorA[i] == 7) {
                vetorB[i] = String.valueOf('b');
            } else if (vetorA[i] > 7 && vetorA[i] <= 10) {
                vetorB[i] = String.valueOf('c');
            } else if (vetorA[i] > 10) {
                vetorB[i] = String.valueOf('d');
            }
        }

        System.out.println();
        System.out.print("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();
        System.out.print("Vetor B: ");
        for (int i = 0; i < vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }

    }

}
