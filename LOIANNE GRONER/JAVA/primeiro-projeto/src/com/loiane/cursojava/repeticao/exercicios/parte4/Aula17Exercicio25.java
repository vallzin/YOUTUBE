package com.loiane.cursojava.repeticao.exercicios.parte4;


import java.util.Scanner;

public class Aula17Exercicio25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de pessoas");
        int n = sc.nextInt();

        int idade;
        int denominado = n;
        double soma = 0;
        double mediaIdade;
        do {
            System.out.print("Digite sua idade: ");
            idade = sc.nextInt();
            soma += idade;
            mediaIdade = soma / denominado;
            n--;

        }while (n != 0);

        if(mediaIdade > 0 && mediaIdade < 25){
            System.out.println("A turma é jovem");
        } else if (mediaIdade > 25 && mediaIdade < 60) {
            System.out.println("A turma é adulta");
        } else if (mediaIdade > 60) {
            System.out.println("A turma é idosa");
        }


    }
}

