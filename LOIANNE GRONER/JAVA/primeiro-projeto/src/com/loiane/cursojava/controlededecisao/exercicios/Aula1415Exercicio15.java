package com.loiane.cursojava.controlededecisao.exercicios;

import java.util.Scanner;

public class Aula1415Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os lados do triângulo");
        System.out.print("Digite o primeiro lado: ");
        int lado1 = sc.nextInt();
        System.out.print("Digite o segundo lado: ");
        int lado2 = sc.nextInt();
        System.out.print("Digite o terceiro lado: ");
        int lado3 = sc.nextInt();


        if(((lado1 + lado2) > lado3)
        && ((lado2 + lado3) > lado1)
        && ((lado3 + lado1) > lado2)){
            if(lado1 != lado2
               && lado2 != lado3
               && lado3 != lado1){
                System.out.println("É um triângula Escaleno");
            } else if ((lado1 == lado2) && (lado2 == lado3)){
                System.out.println("É um triângula Equilátero");
            } else {
                System.out.println("É um triângula Isósceles");
            }
        }else {
            System.out.println("Não forma um triângulo");
        }
    }
}
