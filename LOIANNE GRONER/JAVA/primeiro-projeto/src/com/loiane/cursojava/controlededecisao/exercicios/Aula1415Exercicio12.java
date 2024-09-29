package com.loiane.cursojava.controlededecisao.exercicios;

import java.util.Scanner;

public class Aula1415Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da hora/trabalho: ");
        double hora = sc.nextDouble();
        System.out.println("Digite a quantidade de horas trabalhada: ");
        double horatrab = sc.nextDouble();

        double salarioBruto = hora * horatrab;

        int impostoRenda = 0;
        if(salarioBruto > 900.0 && salarioBruto <= 1500.0){
            impostoRenda = 5;
        } else if (salarioBruto > 1500.0 && salarioBruto <= 2500.0) {
            impostoRenda = 10;
        } else if (salarioBruto > 2500.0) {
            impostoRenda = 20;
        }

        double descontoIR = (salarioBruto * impostoRenda) / 100;
        double descontoINSS = (salarioBruto * 10) / 100;
        double descontoFGTS = (salarioBruto * 11) / 100;
        double totalDescontos = descontoIR + descontoINSS;
        double salarioFinal = salarioBruto - totalDescontos;

        System.out.printf("Salário Bruto: R$%.2f%n",salarioBruto);
        System.out.printf("- IR ( %d%% ) R$%.2f%n", impostoRenda, descontoIR);
        System.out.printf("- INSS ( 10%% ): R$%.2f%n", descontoINSS);
        System.out.printf("FGTS ( 11%% ): R$%.2f%n", descontoFGTS);
        System.out.printf("Total de descontos: R$%.2f%n", totalDescontos);
        System.out.printf("Salário Liquido: R$%.2f",salarioFinal);


    }
}
