package com.loiane.cursojava.repeticao.exercicios;

public class Aula17Exercicio04 {
    public static void main(String[] args) {

        int popA = 80000;
        int popB = 200000;
        int ano = 0;

        while (popA < popB) {

            popA +=  (popA * 3) / 100;
            popB += (int) ((popB * 1.5) / 100);


            ano++;

        }

        System.out.println("População A: " + popA);
        System.out.println("População B: " + popB);
        System.out.println("Qautidades de anos: " + ano);







    }
}

