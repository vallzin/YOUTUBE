package com.loiane.cursojava.controlededecisao.exercicios;

import java.util.Scanner;

public class Aula1415Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite apenas números inteiros");
        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();
        System.out.print("Digite o terceiro número: ");
        int num3 = sc.nextInt();

        if(num1 < num2 && num1 < num3){
            if(num2 < num3){
                System.out.printf("Os números em ordem decrescente são: %d num1, %d num2 e %d num3", num1, num2, num3);
            } else{
                System.out.printf("Os números em ordem decrescente são: %d num1, %d num3 e %d num2", num1, num3, num2);
            }
        } else if (num2 < num1 && num2 < num3 ) {
            if(num1 < num3){
                System.out.printf("Os números em ordem decrescente são: %d num2, %d num1 e %d num3", num2, num1, num3);
            } else{
                System.out.printf("Os números em ordem decrescente são: %d num2, %d num3 e %d num1", num2, num3, num1);
            }
        } else if (num3 < num2 && num3 < num1) {
            if(num2 < num1){
                System.out.printf("Os números em ordem decrescente são: %d num3, %d num2 e %d num1", num3, num2, num1);
            } else{
                System.out.printf("Os números em ordem decrescente são: %d num3, %d num1 e %d num2", num3, num1, num2);
            }
        }


    }
}
