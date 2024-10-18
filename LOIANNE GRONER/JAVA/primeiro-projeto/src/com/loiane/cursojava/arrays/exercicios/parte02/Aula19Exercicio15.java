package com.loiane.cursojava.arrays.exercicios.parte02;

import java.util.Scanner;

public class Aula19Exercicio15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++){
            System.out.print("Digite o valor do array na posição (" + i+") ");
            vetorA[i] = sc.nextInt();
        }

        double percPar;
        double percImpar;
        double qtdPar = 0;
        double qtdImpar = 0;
//      Quantidade de números pares e ímpares
//        for (int i = 0; i < vetorA.length; i++){
//            if(vetorA[i] % 2 == 0){
//                qtdPar++;
//            }else {
//                qtdImpar++;
//            }
//        }
//      Qauntidade de números pares e ímpares
        for (int i = 0; i < vetorA.length; i++){
            if (vetorA[i] % 2 == 0)
                qtdPar++;
        }

        qtdImpar = vetorA.length - qtdPar;

        percPar = (100 * qtdPar) / vetorA.length;
//      Primeira formas de calcular porcentagem dos ímpares
//        percImpar = (100 * qtdImpar) / vetorA.length;
//      Segunda forma de calcular porcentagem dos ímpares
        percImpar = 100 - percPar;

        System.out.print("Vetor A = ");
        for (int vtA : vetorA) {
            System.out.print(vtA + " ");
        }
        System.out.println();
        System.out.println("A percentual de valores pares no vetor A é " + percPar +"%");
        System.out.println("A percentual de valores ímpares no vetor A é "+ percImpar +"%");

    }

}
