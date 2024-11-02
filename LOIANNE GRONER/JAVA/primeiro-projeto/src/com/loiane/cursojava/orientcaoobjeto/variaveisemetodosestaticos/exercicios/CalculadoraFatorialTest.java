package com.loiane.cursojava.orientcaoobjeto.variaveisemetodosestaticos.exercicios;

import java.util.Scanner;

public class CalculadoraFatorialTest {

    public static void main(String[] args) {

        CalculadoraFatorial fatorial = new CalculadoraFatorial();

        Scanner sc = new Scanner(System.in);

        int num;
        do {
            System.out.print("Digite um número positivo: ");
            num = sc.nextInt();
            if (num < 0){
                System.out.println("Número inválido, tente novamente");
            }

        }while(num < 0);

        System.out.println(CalculadoraFatorial.Fatorial(num));
    }





}
