package com.loiane.cursojava.repeticao.exercicios.parte1;

import java.util.Scanner;

public class Aula17Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean valida = false;
        String nome;
        int idade = 0;
        double salario;
        String sexo;
        String estadoCivil;
        do {
            System.out.print("Digite seu nome: ");
            nome = sc.next();
            if (nome.length() > 3) {
                valida = true;
            }else {
                System.out.println("nome tem que ter mais de 3 letras");
            }
        }while (!valida);

        valida = false;
        do {
            System.out.println("Digite sua idade: ");
            idade = sc.nextInt();
            if (idade > 0 && idade <= 150){
                valida = true;
            }else {
                System.out.println("idade tem que ser entre 0 e 150");
            }
        }while (!valida);

        valida = false;
        do {
            System.out.print("Digite seu salário: R$ ");
            salario = sc.nextDouble();
            if (salario > 0){
                valida = true;
            }else {
                System.out.print("salario tem que ser maior do que zero\n");
            }
        }while (!valida);

        valida = false;
        do {
            System.out.print("Digite seu sexo: ");
            System.out.println("'f' para feminino e 'm' para masculino");
            sexo = sc.next();
            if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")){
                valida = true;
            }else {
                System.out.println("opção inválida \n");
            }
        }while (!valida);


        valida = false;
        do {
            System.out.print("Digite seu estado civil: ");
            System.out.println(""+
                    "Solteiro: 's'\n" +
                    "Casado: 'c'\n" +
                    "Viúvo: 'v'\n" +
                    "Divorciado: 'd'\n");
            estadoCivil = sc.next();
            if (estadoCivil.equalsIgnoreCase("s")
                    || estadoCivil.equalsIgnoreCase("c")
                    ||estadoCivil.equalsIgnoreCase("v")
                    ||estadoCivil.equalsIgnoreCase("d")){
                valida = true;
            }else {
                System.out.print("opção inválida");
            }
        }while (!valida);


    }
}

