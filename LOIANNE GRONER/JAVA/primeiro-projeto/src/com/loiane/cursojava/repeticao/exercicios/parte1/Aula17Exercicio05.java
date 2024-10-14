package com.loiane.cursojava.repeticao.exercicios.parte1;

import java.util.Scanner;
import java.util.Locale;


public class Aula17Exercicio05 {
    public static void main(String[] args) {

        Locale.setDefault(new Locale("en","US"));
        Scanner sc = new Scanner(System.in);

        double popA;
        double popB;
        double txA;
        double txB;

        int ano = 0;

        boolean valido = false;

        do {
            System.out.print("Digite a população da cidade A:");
            popA = sc.nextInt();
            if (popA > 0){
                valido = true;
            }else {
                System.out.println("População tem que ser maior do que zero");
            }

        }while (!valido);

        do {
            System.out.print("Digite a população da cidade B:");
            popB = sc.nextInt();
            if (popA > 0){
                valido = true;
            }else {
                System.out.println("População tem que ser maior do que zero");
            }

        }while (!valido);

        do {
            System.out.print("Digite a taxa de crescimento cidade A:");
            txA = sc.nextDouble();
            if (txA > 0){
                valido = true;
            }else {
                System.out.println("Taxa tem que ser maior do que zero");
            }

        }while (!valido);

        do {
            System.out.print("Digite a taxa de crescimento cidade B:");
            txB = sc.nextDouble();
            if (txA > 0){
                valido = true;
            }else {
                System.out.println("Taxa tem que ser maior do que zero");
            }

        }while (!valido);

        do {
            popA += (popA * txA) / 100;
            popB += ((popB * txB) / 100);
            ano++;

        }while(popA < popB);



        System.out.println("População A: " + popA);
        System.out.println("População B: " + popB);
        System.out.println("Quantidades de anos: " + ano);







    }
}

