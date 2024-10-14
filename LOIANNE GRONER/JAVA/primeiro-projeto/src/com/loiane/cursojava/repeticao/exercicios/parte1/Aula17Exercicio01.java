package com.loiane.cursojava.repeticao.exercicios.parte1;

import java.util.Scanner;

public class Aula17Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite  uma nota entre zero e dez");
        int nota = sc.nextInt();

        boolean faca = false;
        do {
            if(nota >= 0 && nota <= 10){
                faca = true;
                System.out.println("Você digitou: " + nota);

            }else {
                System.out.println("Nota inválida, digite novamente");
                nota = sc.nextInt();
            }
        }while(!faca);

    }
}
