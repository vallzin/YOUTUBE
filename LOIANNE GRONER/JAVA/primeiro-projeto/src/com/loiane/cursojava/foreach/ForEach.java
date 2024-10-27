package com.loiane.cursojava.foreach;

import java.util.Random;
public class ForEach {
    public static void main(String[] args) {

        int[] notas = new int[10];

        Random rdm = new Random();

        for (int i = 0; i < notas.length; i++){

            notas[i] = rdm.nextInt(10);

        }
        System.out.println();
        System.out.println("Usando um 'for padrão':");
        for (int i = 0; i < notas.length; i++){
            System.out.print(notas[i]+ " ");
        }

        System.out.println();
        System.out.println("\nUsando o 'foreach':");
        for (int nota : notas){
            System.out.print(nota+" ");
        }
        System.out.println("\ncom tipos primitivos,\n o for each é usado para output");

        System.out.println();
        System.out.println("Exemplo com arrays multidimensionais:");
        double[][] notasAlunos = new double[3][4];

        notasAlunos[0][0] = 8;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 6.6;
        notasAlunos[0][3] = 9;

        notasAlunos[1][0] = 5;
        notasAlunos[1][1] = 10;
        notasAlunos[1][2] = 5.5;
        notasAlunos[1][3] = 6;

        notasAlunos[2][0] = 7;
        notasAlunos[2][1] = 4;
        notasAlunos[2][2] = 8.5;
        notasAlunos[2][3] = 9;

        for (double[] notaAluno : notasAlunos){
            for (double nota : notaAluno){
                System.out.print(nota+" ");
            }
            System.out.println();
        }


    }
}
