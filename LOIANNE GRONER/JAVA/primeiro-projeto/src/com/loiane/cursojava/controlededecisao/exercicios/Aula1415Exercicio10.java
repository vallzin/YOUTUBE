package com.loiane.cursojava.controlededecisao.exercicios;

import java.util.Scanner;

public class Aula1415Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual turno você estuda? ");
        System.out.println("Digite M (matutino) V (vespertino) ou N (noturno)");
//        String turno = sc.next().toLowerCase();
        String turno = sc.next();

//        switch (turno){
//            case "m":
//                System.out.println("Bom dia!");
//                break;
//            case "v":
//                System.out.println("Boa tarde");
//                break;
//            case "n":
//                System.out.println("Boa noite");
//            default:
//                System.out.println("Opção inválida");
//        }

        if(turno.equalsIgnoreCase("m")){
            System.out.println("Bom dia!");
        } else if (turno.equalsIgnoreCase("v")) {
            System.out.println("Boa tarde");
        } else if (turno.equalsIgnoreCase("n")) {
            System.out.println("Boa noite");
        }else {
            System.out.println("Opção inválida");
        }
        sc.close();

    }
}
