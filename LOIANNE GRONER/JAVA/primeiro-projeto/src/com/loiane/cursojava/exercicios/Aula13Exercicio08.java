package com.loiane.cursojava.exercicios;

import java.util.Scanner;
/*
* 08) Faça um programa que pergunte quanto você ganha por hora
* e o número de horas trablhadas no mês. Calcule e
* moste o total do seu salário no mês.
* */
public class Aula13Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total Salário mês.");
        System.out.println("Qual o valor do seu salário hora?");
        double salarioHora = sc.nextDouble();
        double salarioMes = 30 * salarioHora;
        System.out.println("O valor do seu salário no mês é de: " + salarioMes);


    }
}
