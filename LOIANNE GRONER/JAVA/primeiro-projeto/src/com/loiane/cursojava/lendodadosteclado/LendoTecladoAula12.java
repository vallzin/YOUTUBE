package com.loiane.cursojava.lendodadosteclado;

import java.util.Scanner;

public class LendoTecladoAula12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = sc.nextLine();
        System.out.println("Nome completo é: " + nomeCompleto);

        System.out.print("Digite seu primeiro nome: ");
        String primeiroNome = sc.next();
        System.out.println("Seu primeiro nome é: " + primeiroNome);

        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Sua idade é: " + idade);

        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();
        System.out.println("Sua altura é: " + altura);
        */

        System.out.println("Digite o seu primeiro nome," +
                "idade, quantidade de filhos, " +
                "altura e se tem pets");
        String priNome = sc.next();
        int minhaIdade = sc.nextInt();
        byte qtdFilhos = sc.nextByte();
        float minhaAltura = sc.nextFloat();
        boolean pets = sc.nextBoolean();
        System.out.println();
        System.out.println("Você digitou as seguintes informações:");
        System.out.println("Primeiro nome " + priNome);
        System.out.println("Idade: " + minhaIdade);
        System.out.println("Quantidade de filhos: " + qtdFilhos);
        System.out.println("Sua altura: " + minhaAltura);
        System.out.println("Se tens pets: " + pets);



    }
}
