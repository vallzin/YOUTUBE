package com.loiane.cursojava.controlededecisao.exercicios;

import java.util.Scanner;

public class Aula1415Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma letra: ");
        String letra = sc.next();

        /*
        if(letra.equalsIgnoreCase("a")
                || letra.equalsIgnoreCase("e")
                || letra.equalsIgnoreCase("i")
                || letra.equalsIgnoreCase("o")
                || letra.equalsIgnoreCase("u")
        ){
            System.out.println("Você digitou uma vogal");
        }else {
            System.out.println("Você digitou uma consoante");
        }
         */

        if(letra.length() > 1){
            System.out.println("Digite apenas uma letra");
        }else {
            switch (letra) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                    System.out.println("Você digitou uma vogal");
                    break;
                default:
                    System.out.println("Você digitou uma consoante");
            }
        }

    }
}
