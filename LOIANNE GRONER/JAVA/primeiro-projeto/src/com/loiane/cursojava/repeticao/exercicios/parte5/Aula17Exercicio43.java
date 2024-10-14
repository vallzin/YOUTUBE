package com.loiane.cursojava.repeticao.exercicios.parte5;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Aula17Exercicio43 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod;
        int qtd;
        double total = 0;
        String output = "";
        boolean naoTerminar = true;
        do {
            System.out.println("Digite o código e a quantidade" +
                    "Digite 00 para sair.");
            cod = sc.nextInt();
            qtd = sc.nextInt();

            if (cod == 0 && qtd == 0){
                naoTerminar = false;
                output += "Total a pagar = "+total;
            }else {
                if (cod == 100){
                    output += "Cachorro Quente -> 1,20 * "+qtd;
                    output += " = " + (1.2 * qtd) + "\n";
                    total += 1.2 * qtd;
                } else if (cod == 101) {
                    output += "Bauru Simples -> 1,30 * "+qtd;
                    output += " = " + (1.3 * qtd) + "\n";
                    total += 1.3 * qtd;
                }else if (cod == 102) {
                    output += "Bauru c/Ovo -> 1,50 * "+qtd;
                    output += " = " + (1.5 * qtd) + "\n";
                    total += 1.5 * qtd;
                }else if (cod == 103) {
                    output += "Hamburguer -> 1,20 * "+qtd;
                    output += " = " + (1.2 * qtd) + "\n";
                    total += 1.2 * qtd;
                }else if (cod == 104) {
                    output += "Cheeseburguer -> 1,30 * "+qtd;
                    output += " = " + (1.3 * qtd) + "\n";
                    total += 1.3 * qtd;
                }else if (cod == 105) {
                    output += "Refrigerante -> 1,00 * "+qtd;
                    output += " = " + (1.0 * qtd) + "\n";
                    total += 1.0 * qtd;
                }
            }

        }while (naoTerminar);
        System.out.println(output);




    }
}

