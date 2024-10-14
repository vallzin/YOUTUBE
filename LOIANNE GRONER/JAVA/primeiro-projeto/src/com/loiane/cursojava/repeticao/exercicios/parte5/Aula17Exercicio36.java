package com.loiane.cursojava.repeticao.exercicios.parte5;

import java.util.Locale;
import java.util.Scanner;

public class Aula17Exercicio36 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Montar a tabuada de ");
        int tab = sc.nextInt();


        int numInicio;
        int numFinal;
        boolean invalido = true;
        do {
            System.out.print("Digite o início da tabuada ");
            numInicio = sc.nextInt();
            System.out.print("Digite o final da tabuada ");
            numFinal = sc.nextInt();
            System.out.println();
            if (numFinal > numInicio){
                invalido = false;
            }

        }while (invalido);


        System.out.println("Tabuada de "+tab);
        System.out.println("Começada em "+numInicio);
        System.out.println("Terminada em "+numFinal);
        System.out.println();
        for (int i = numInicio; i <= numFinal; i++){
            System.out.println(" "+tab+" x "+i+" = "+(tab * i));
        }


    }
}

