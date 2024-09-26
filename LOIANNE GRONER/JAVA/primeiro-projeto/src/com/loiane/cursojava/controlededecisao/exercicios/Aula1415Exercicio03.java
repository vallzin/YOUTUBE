package com.loiane.cursojava.controlededecisao.exercicios;

import java.util.Scanner;

public class Aula1415Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 'F' para feminino e 'M' para masculino");
        String letra = sc.next();

//        if(letra.equals("F")  || letra.equals("f")){
//            System.out.println("Você digitou o EFÊ");
//        }else if (letra.equals("M") || letra.equals("m")){
//            System.out.println("Você digitou o EMÊ");
//        }else {
//            System.out.println("Sexo inválido");
//        }

        if(letra.equalsIgnoreCase("f")){
            System.out.println("Você digitou o EFÊ");
        }else if (letra.equalsIgnoreCase("m")){
            System.out.println("Você digitou o EMÊ");
        }else {
            System.out.println("Sexo inválido");
        }

    }
}
