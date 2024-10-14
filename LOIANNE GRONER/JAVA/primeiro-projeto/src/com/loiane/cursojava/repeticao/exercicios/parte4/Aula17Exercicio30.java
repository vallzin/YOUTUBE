package com.loiane.cursojava.repeticao.exercicios.parte4;


public class Aula17Exercicio30 {
    public static void main(String[] args) {

        System.out.println("Preço do pão: R$ 0.18");
        System.out.println("Panificadora Pão de Ontem - Tabela de preços");

        for(int i = 1; i <= 50; i++){
            System.out.printf(" %d - R$ %.2f%n", i , (0.18 * i));
        }


    }
}

