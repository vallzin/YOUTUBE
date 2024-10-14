package com.loiane.cursojava.repeticao.exercicios.parte4;

import java.util.Locale;
import java.util.Scanner;

public class Aula17Exercicio34 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        boolean ehPrimo = false;

        do {
            System.out.print("Digite um número inteiro: ");
            int num = sc.nextInt();
            if (num % 2 != 0){
                System.out.print("É número primo");
                ehPrimo = true;
            }else {
                System.out.print("Número não é primo");
            }
        }while (!ehPrimo)

;

    }
}

