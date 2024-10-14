package com.loiane.cursojava.repeticao.exercicios.parte2;


import java.util.Scanner;

public class Aula17Exercicio12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Gerado de Tabuada");
        System.out.print("Digite o número da Tabuada: ");
        int num = sc.nextInt();

        System.out.println("Tabuada de " + num + ":");
        for(int i = 1; i <= 10; i++){
            System.out.println(num + " x "+ i + " = " + (num * i));
        }







    }
}

