package com.loiane.cursojava.repeticao.exercicios;


import java.util.Scanner;

public class Aula17Exercicio14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        int qtdPar = 0;
        int qtdImpar = 0;
        int somaPar = 0;
        int somaImpar = 0;
        int bandeira = 0;
        while (bandeira < 10){
            System.out.print("Digite o "+(bandeira + 1)+"º número inteiro: ");
            num = sc.nextInt();
            if(num % 2 == 0){
                qtdPar++;
                somaPar += num;
            }else {
                somaImpar += num;
                qtdImpar++;
            }
            bandeira++;
        }

        if(somaPar != 0){
            System.out.println("A quantidade de números pares é " + qtdPar
                    +" e a Soma dos números pares = " + somaPar);
        } else{
            System.out.println("A soma dos números pares é zero");

        }

        if(somaImpar != 0){
            System.out.println("A quantidade de números ímpares é " + qtdImpar
                    + " soma e a quantidade dos números ímpares é " + somaImpar);
        } else{
            System.out.println("A soma dos números ímpares é zero");
        }


    }
}

