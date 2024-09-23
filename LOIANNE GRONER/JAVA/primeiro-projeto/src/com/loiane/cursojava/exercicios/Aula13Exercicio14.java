package com.loiane.cursojava.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Aula13Exercicio14 {
    /*
    Faça um Programa que pergunte quanto você ganha por hora
    e o número de horas trabalhadas no mês. Calcule e mostre
    o total do seu salário no referido mês, sabendo-se que são
     descontados 11% para o Imposto de Renda, 8% para o INSS e
     5% para o sindicato, faça um programa que nos dê:
    salário bruto. Quanto pagou ao INSS. Quanto pagou ao sindicato.
    O salário líquido. Calcule os descontos e o salário líquido,
    conforme a tabela abaixo:
    + Salário Bruto : R$
    - IR (11%) : R$
    - INSS (8%) : R$
    - Sindicato ( 5%) : R$
    = Salário Liquido : R$
    */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("********** SALÁRIO LÍQUIDO **********");
        System.out.print("Quanto você ganha por hora?");
        double valorHora = sc.nextDouble();
        System.out.print("Quantas horas trabalhadas?");
        double horasTrab = sc.nextDouble();
        double salarioBruto = valorHora * horasTrab;
        System.out.println("Salário Bruto : R$ " + salarioBruto);
        double impRenda = (salarioBruto / 100 ) * 11;
        System.out.println("IR (11%) : R$ " + impRenda);
        double inss = (salarioBruto / 100) * 8;
        System.out.println("INSS (8%) : R$ " + inss);
        double sindicato = (salarioBruto / 100) * 5;
        System.out.println("Sindicato (5%) : R$ " + sindicato);
        double totalDescontos = impRenda + inss + sindicato;
        System.out.println("Total de descontos : R$ " + totalDescontos);
        double salarioLiq = salarioBruto - totalDescontos;
        System.out.println("Salário líquido: R$" + salarioLiq);


        sc.close();
    }
}
