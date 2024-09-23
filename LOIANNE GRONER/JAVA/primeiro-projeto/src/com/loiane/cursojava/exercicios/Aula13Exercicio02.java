package com.loiane.cursojava.exercicios;

import java.util.Scanner;

public class Aula13Exercicio02 {
    /*
    1) Faça um programa que peça um número e então mostre a mensagem 'O número informado foi [número].
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        sc.close();
        System.out.println("O número digitado foi: " + num);

    }
}
