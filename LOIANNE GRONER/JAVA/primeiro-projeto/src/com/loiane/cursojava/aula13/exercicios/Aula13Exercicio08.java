package com.loiane.cursojava.aula13.exercicios;

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
        System.out.println("Qual o valor da hora de trabalho?");
        double valorHora = sc.nextDouble();
        System.out.println("Quantas horas trabalhada no mês?");
        double horasTrabalho = sc.nextDouble();
        double salarioMes = valorHora * horasTrabalho;
        System.out.println("O salário do mês é de: " + salarioMes);


    }
}
