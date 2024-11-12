package com.loiane.cursojava.excecao;

import java.util.Scanner;

public class UsandoThrows {

    public static void main(String[] args) {

        System.out.print("Digite um número decimal: ");
        try {
            double num = lerNumero();
            System.out.println("Você digitou: " + num);
        } catch (Exception e) {
            System.out.println("Entrada inválida");
            throw new RuntimeException(e);
        }

    }

    public static double lerNumero() throws Exception{
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        return num;
    }
}
