package com.loiane.cursojava.arrays.exercicios.parte02;

import java.util.Scanner;

public class Aula19Exercicio18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] idades = new int[10];

        for (int i = 0; i < idades.length; i++){
            System.out.print("Digite a " + (i + 1)+"ª idade: ");
            idades[i] = sc.nextInt();
        }

        int menorIdade = idades[0];
        int indexMenor = 0;
        int maiorIdade = idades[0];
        int indexMaior = 0;

        for (int i = 1; i < idades.length; i++){

            if(idades[i] > maiorIdade){
                maiorIdade = idades[i];
                indexMaior = i;
            } else if (idades[i] < menorIdade) {
                menorIdade = idades[i];
                indexMenor = i;
            }
        }

        System.out.println("Vetor de idades: ");
        for (int i = 0; i < idades.length; i++){
            System.out.print(idades[i]+" ");
        }
        System.out.println();
        System.out.println("A maior idade é "+maiorIdade+" e sua posição é "+indexMaior);
        System.out.println("A maior idade é "+menorIdade+" e sua posição é "+indexMenor);

    }

}
