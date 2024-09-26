package com.loiane.cursojava.controlededecisao.exercicios;

import java.util.Scanner;

public class Aula1415Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num = sc.nextInt();

        if(num >= 0){
            System.out.println("Número positivo");
        }else {
            System.out.println("Números negativo");
        }

    }
}
