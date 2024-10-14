package com.loiane.cursojava.repeticao.exercicios.parte4;


import java.util.Scanner;

public class Aula17Exercicio24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de notas:");
        int n = sc.nextInt();

        double soma = 0;
        double media;
        double nota;
        for (int i = 0; i < n; i++){
            System.out.println("Entre com a nota "+ (i + 1));
            nota = sc.nextDouble();

            soma += nota;
        }
        System.out.println("Soma = "+ soma);
        System.out.println("Média = "+ (soma / n));

    }
}

