package com.loiane.cursojava.arrays.exercicios.parte02;

import java.util.Scanner;

public class Aula19Exercicio16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++){
            System.out.print("Digite os valores do array A: ");
            vetorA[i] = sc.nextInt();
        }

        int somaMenor15 = 0;
        int somaMaior15 = 0;
        int qtdMaior15 = 0;
        int qtdigual15 = 0;

        for (int i = 0; i < vetorA.length; i++){
            if(vetorA[i] == 15) {
                qtdigual15++;
            }else if (vetorA[i] < 15) {
                somaMenor15 =+ vetorA[i];
            }else{
                qtdMaior15++;
                somaMaior15 += vetorA[i];
            }
        }
        System.out.println("Quantidade números igual a 15:  "+qtdigual15);
        System.out.println("Quantidade números menor do que 15:  "+qtdigual15);
        System.out.println("Média dos números maior do que 15:  "+(somaMaior15/qtdMaior15));

    }

}
