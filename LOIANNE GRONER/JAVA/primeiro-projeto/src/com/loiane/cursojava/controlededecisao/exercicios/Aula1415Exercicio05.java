package com.loiane.cursojava.controlededecisao.exercicios;

import java.util.Scanner;

public class Aula1415Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a primeira nota: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        if(media == 10){
            System.out.println("Aluno Aprovado com distinção");
        } else if (media >=7) {
            System.out.println("Aluno aprovado");
        }else {
            System.out.println("Aluno reprovado");
        }


    }
}
