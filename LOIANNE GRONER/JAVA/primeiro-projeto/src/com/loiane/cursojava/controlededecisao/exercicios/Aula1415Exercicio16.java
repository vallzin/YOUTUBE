package com.loiane.cursojava.controlededecisao.exercicios;

import java.util.Scanner;

public class Aula1415Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor para a: ");
        double a = sc.nextDouble();

        if(a == 0){
            System.out.println("Não é equação");
        } else {
            System.out.print("Digite o valor para b: ");
            double b = sc.nextDouble();
            System.out.print("Digite o valor para c: ");
            double c = sc.nextDouble();

            double delta = (Math.pow(b, 2) - (4*a*c));
            double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
            double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);


            if (delta < 0){
                System.out.println(delta + " Delta negativo:");
                System.out.println("Equação não possui raízes reais.");
            } else if (delta == 0) {
                System.out.println("Delta: " + delta);
                System.out.println("Equação possui uma raíz real");
                System.out.printf("X1 = X2 =  %.2f%n", x2);

            } else if (delta > 0) {
                System.out.println("Delta: " + delta);
                System.out.println("Equação possui duas raízes reais");
                System.out.printf("X1 = %.2f%n", x1);
                System.out.printf("X2 = %.2f%n", x2);

            }
        }

    }
}
