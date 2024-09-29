package com.loiane.cursojava.controlededecisao.exercicios;

import java.util.Scanner;

public class Aula1415Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a primeira nota:");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota:");
        double nota2 = sc.nextDouble();

        double soma = nota1 + nota2;
        double media = soma / 2;

        String situacao = "F";
        String conceito;

        if(media >= 9.0){
            conceito = "A";
        } else if ((media >= 7.5) && (media < 9.0)) {
            conceito = "B";
        } else if ((media >= 6.0) && (media < 7.5)) {
            conceito = "C";
        } else if ((media >= 4.0) && (media < 6.0)) {
            conceito = "D";
        }else {
            conceito = "E";
        }

        if(conceito.equals("A")|| conceito.equals("B")|| conceito.equals("C")
        ){
            situacao = "APROVADO";
        } else{
            situacao = "REPROVADO";
        }

        System.out.println("Sua primeira nota foi " + nota1);
        System.out.println("Sua segunda nota foi " + nota2);
        System.out.println("Sua média é " + media);
        System.out.println("Seu conceito foi " + conceito);
        System.out.println("Você está " + situacao);

    }
}
