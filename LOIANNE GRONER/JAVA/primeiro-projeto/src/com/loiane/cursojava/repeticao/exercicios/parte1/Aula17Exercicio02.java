package com.loiane.cursojava.repeticao.exercicios.parte1;

import java.util.Scanner;

public class Aula17Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        boolean senhaValida = false;
        String nome;
        String senha;
        do {
            System.out.println("Digite o nome de usuário:");
            nome = sc.next();
            System.out.println("Digite uma senhaValida:");
            senha = sc.next();

            if(nome.equalsIgnoreCase(senha)){
                System.out.println("Senha inválida");
                System.out.println("senha igual ao usuario");
                System.out.println("tente novamente");
            }else{
                System.out.println("login válido");
                senhaValida = true;
            }

        }while(!senhaValida);


    }
}
