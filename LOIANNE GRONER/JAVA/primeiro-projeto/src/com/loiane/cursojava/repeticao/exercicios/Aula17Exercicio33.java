package com.loiane.cursojava.repeticao.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Aula17Exercicio33 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de temperatura");
        int qtdTemper = sc.nextInt();

        double temp;
        double soma = 0;
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;

        for (int i = 1; i <= qtdTemper; i++){
            System.out.printf("Digite a %dº temperatura: ", i);
            temp = sc.nextDouble();

            soma += temp;

            if (temp > maior){
                maior = temp;
            }
            if(temp < menor){
                menor = temp;
            }
        }
        System.out.println("Média: "+ (soma / qtdTemper));
        System.out.println("Menor temperatura: " + menor);
        System.out.println("Maior temperatua: "+ maior);

    }
}

