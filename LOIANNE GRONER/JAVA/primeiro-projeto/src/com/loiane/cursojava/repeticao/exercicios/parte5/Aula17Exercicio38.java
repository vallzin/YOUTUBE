package com.loiane.cursojava.repeticao.exercicios.parte5;

import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Aula17Exercicio38 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = 1000;

        double percentual = 1.5;
//        salario += (salario/100) * percentual;

        DecimalFormat format = new DecimalFormat("###,###.##");

        for (int i = 1997; i <= 2015; i++){
            percentual *= 2;

            salario += (salario/100) * percentual;

            System.out.println(i+" =  "+format.format(salario)+" - "+percentual+"%");
        }




    }
}

