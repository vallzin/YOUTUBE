package com.loiane.cursojava.controlededecisao.exercicios;

import java.util.Scanner;

public class Aula1415Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro números inteiros: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo números inteiros: ");
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println("O maior número é "+ num1);
        }else {
            System.out.println("O maior número é "+ num2);
        }
    }
}
