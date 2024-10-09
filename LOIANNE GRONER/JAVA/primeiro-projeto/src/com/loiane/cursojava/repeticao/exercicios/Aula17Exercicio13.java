package com.loiane.cursojava.repeticao.exercicios;


import java.util.Scanner;

public class Aula17Exercicio13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Potenciação");
        System.out.println("Digite o valor da base");
        int base = sc.nextInt();
        System.out.println("Digite o valor do expoente");
        int pot = sc.nextInt();

        int potencia = base;
        for(int i = 1; i < pot; i++){
            potencia *= base;
        }
        System.out.println(" "+base+ " elevado a "+ pot + " = "+potencia);






    }
}

