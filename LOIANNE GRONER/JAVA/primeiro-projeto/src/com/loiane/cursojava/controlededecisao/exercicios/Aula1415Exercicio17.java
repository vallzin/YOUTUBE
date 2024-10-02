package com.loiane.cursojava.controlededecisao.exercicios;

import java.util.Scanner;

public class Aula1415Exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano por completo: ");
        int ano = sc.nextInt();

        if( ano != 0) {
            if((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
                System.out.println("Ano Bissexto");
            }else{
                System.out.println("Não é ano Bissexto");
            }

        }




    }
}
