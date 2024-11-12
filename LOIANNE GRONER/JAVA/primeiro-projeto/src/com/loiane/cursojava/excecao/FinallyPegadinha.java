package com.loiane.cursojava.excecao;

public class FinallyPegadinha {
    public static void main(String[] args) {

        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] demon = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i] / demon[i]));
            } catch (ArithmeticException e1) {
                System.out.println("Erro aritmético");
                System.exit(0);
            } catch (ArrayIndexOutOfBoundsException e2) {
                System.out.println("Excedeu o index do Array");
                System.exit(0);
            } finally {
                System.out.println("Essa linha é impressa sempre após o try ou catch");
            }
        }
    }
}
