package com.loiane.cursojava.controlededecisao.exercicios;

import java.util.Scanner;

public class Aula1415Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do seu salário: ");
        double salario = sc.nextDouble();

        int percentual = 0;
        if(salario <= 280.00){
            percentual = 20;
        } else if (salario > 280.0 && salario <= 700.0) {
            percentual = 15;
        } else if (salario > 700.0 && salario <= 1500.0) {
            percentual = 10;
        } else if (salario > 1500.0) {
            percentual = 5;
        }


        double valorAumento = (salario * percentual ) / 100;
        double novoSalario = salario + valorAumento;
        System.out.println("Valor do salário digitado: R$" + salario);
        System.out.println("Percentual de reajuste: "+ percentual + "%");
        System.out.println("O valor do aumento é R$" + valorAumento);
        System.out.println("valor do novo salário é R$" + novoSalario);

    }
}
