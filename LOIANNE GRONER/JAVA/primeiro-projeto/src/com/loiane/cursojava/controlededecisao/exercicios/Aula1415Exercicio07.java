package com.loiane.cursojava.controlededecisao.exercicios;

import java.util.Scanner;

public class Aula1415Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int num2 = sc.nextInt();
        System.out.print("Digite o terceiro número inteiro: ");
        int num3 = sc.nextInt();

//        if (num1 >= num2 && num1 >= num3){
//            System.out.printf("O número 1 ( %d ) é o maior", num1);
//        } else if (num2 > num1 && num2 > num3) {
//            System.out.printf("O número 2 ( %d ) é o maior", num2);
//        }else {// o else é opcional
//            System.out.printf("O número 3 ( %d ) é o maior", num3);
//        }
//
//        if (num1 <= num2 && num1 <= num3){
//            System.out.printf(" o número 1 ( %d ) é o menor", num1);
//        } else if (num2 <= num1 && num2 <= num3) {
//            System.out.printf(" o número 2 ( %d ) é o menor", num2);
//        }else {// o else é opcional
//            System.out.printf(" o número 3 ( %d ) é o menor", num3);
//        }

        if (num1 >= num2 && num1 >= num3){
            System.out.printf("O número 1 ( %d ) é o maior", num1);
            System.out.printf(" o número ( %d ) é o menor", Math.min(num2, num3));
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.printf("O número 2 ( %d ) é o menor", Math.min(num3, num1));
            System.out.printf(" o número ( %d ) é o maior", num2);
        }else {// o else é opcional
            System.out.printf("O número 3 ( %d ) é o maior", num3);
            System.out.printf(" o número ( %d ) é o menor", Math.min(num1, num2));
        }

    }
}
