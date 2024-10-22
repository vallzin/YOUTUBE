package com.loiane.cursojava.arrays.exercicios.parte03;

import java.util.Scanner;

public class Aula19Exercicio19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] nota1 = new double[10];
        double[] nota2 = new double[10];
        double[] resultado = new double[10];

        for (int i = 0; i < nota1.length; i++) {
            System.out.println("Digite a primeira nota("+i+") ");
            nota1[i] = sc.nextDouble();
            System.out.println("Digite a segunda nota("+i+") ");
            nota2[i] = sc.nextDouble();
        }

        for (int i = 0; i < resultado.length; i++){
            resultado[i] = (nota1[i] + nota2[i]) / 2;
        }

        System.out.print("Primeiras notas: ");
        for (int i = 0; i < nota1.length; i++){
            System.out.print(nota1[i] + " ");
        }
        System.out.println();
        System.out.print("Segundas notas: ");
        for (int i = 0; i < nota2.length; i++){
            System.out.print(nota2[i] + " ");
        }

        System.out.println();
        System.out.println("Resultados:");
        for (int i =0; i < resultado.length; i++) {
            if (resultado[i] >= 7) {
                System.out.println("Aluno aprovado, média = " + resultado[i]);
            } else {
                System.out.println("Aluno reprovado, média = " + resultado[i]);
            }
        }

    }

}
