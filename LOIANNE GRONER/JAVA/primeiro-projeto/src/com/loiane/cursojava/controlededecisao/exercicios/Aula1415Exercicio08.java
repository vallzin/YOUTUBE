package com.loiane.cursojava.controlededecisao.exercicios;

import java.util.Scanner;

public class Aula1415Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro preço: ");
        double preco1 = sc.nextDouble();
        System.out.print("Digite o segundo preço: ");
        double preco2 = sc.nextDouble();
        System.out.print("Digite o terceiro preço: ");
        double preco3 = sc.nextDouble();

        if (preco1 <= preco2 && preco1 <= preco3){
            System.out.printf(" o primeiro preço ( %.2f ) é o menor", preco1);
        } else if (preco2 <= preco1 && preco2 <= preco3) {
            System.out.printf(" o segundo preço ( %.2f ) é o menor", preco2);
        }else {// o else é opcional
            System.out.printf(" o terceiro preço ( %.2f ) é o menor", preco3);
        }




    }
}
