package com.loiane.cursojava.repeticao.exercicios.parte5;

import java.util.Locale;
import java.util.Scanner;

public class Aula17Exercicio45 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de 'n' ");
        int n = sc.nextInt();

        double soma = 0;
        for (int i = 1; i <= n; i++){
            soma += (double) 1 /i;
        }

        System.out.println("\nSoma = " + soma);

    }
}

