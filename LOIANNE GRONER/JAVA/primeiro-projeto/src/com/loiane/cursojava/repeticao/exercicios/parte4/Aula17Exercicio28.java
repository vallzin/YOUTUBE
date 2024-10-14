package com.loiane.cursojava.repeticao.exercicios.parte4;


import java.util.Scanner;

public class Aula17Exercicio28 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Coleção de CD's");
        System.out.print("Digite a quantidade de cd's: ");
        int qtdCds = sc.nextInt();

        int soma = 0;
        double media = 0;
        for(int i = 0; i < qtdCds; i++) {
            System.out.print("Digite o valor do cd: ");
            int valorCd = sc.nextInt();

            soma += valorCd;

        }
        media = (double) soma / qtdCds;

        System.out.println("A soma total dos CD's é " + soma);
        System.out.println("O valor médio de cada cd é "+ media);



    }
}

