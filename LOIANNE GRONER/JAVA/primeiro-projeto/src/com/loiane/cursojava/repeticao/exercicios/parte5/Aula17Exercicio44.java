package com.loiane.cursojava.repeticao.exercicios.parte5;

import java.util.Locale;
import java.util.Scanner;

public class Aula17Exercicio44 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de 'n'");
        int n = sc.nextInt();


        double soma = 0;
        for (int i = 1, j = 1; i <= n; i++, j += 2){
            System.out.print(i + "/" + j + " + ");

            soma += (double) i /j;
        }

        System.out.println("\nSoma = " + soma);




    }
}

