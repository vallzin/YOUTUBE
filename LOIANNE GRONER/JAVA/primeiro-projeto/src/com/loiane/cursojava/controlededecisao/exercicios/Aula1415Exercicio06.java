package com.loiane.cursojava.controlededecisao.exercicios;

import java.util.Scanner;

public class Aula1415Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int num2 = sc.nextInt();
        System.out.print("Digite o terceiro número inteiro: ");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.printf("Primeiro número ( %d ) é o maior", num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.printf("Segundo número ( %d ) é o maior", num2);
        }else {// o else é opcional
            System.out.printf("Terceiro número ( %d ) é o maior", num3);
        }

    }
}
