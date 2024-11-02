package com.loiane.cursojava.orientcaoobjeto.recursividade;

import com.loiane.cursojava.orientcaoobjeto.variaveisemetodosestaticos.exercicios.CalculadoraFatorial;

import java.util.Scanner;

public class CalculadoraFatorialRecursivoTest {

    public static void main(String[] args) {

        CalculadoraFatorialRecursivo fatorial = new CalculadoraFatorialRecursivo();

        Scanner sc = new Scanner(System.in);

        int num;
        //método recursivo
        do {
            System.out.print("Digite um número positivo: ");
            num = sc.nextInt();
            if (num < 0){
                System.out.println("Número inválido, tente novamente");
            }

        }while(num < 0);

        System.out.println(CalculadoraFatorialRecursivo.fatorialRecursivo(num));
    }





}
