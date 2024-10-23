package com.loiane.cursojava.arraymultidimensional;

import java.util.Scanner;

public class MatrizIrregular {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Números de intrevistados ");
        int numEntrevistados = sc.nextInt();

        String[][] nomesFilhos = new String[numEntrevistados][];

        int qtdFilhos;
        for (int i = 0; i < nomesFilhos.length; i++){
            System.out.print("Quantidade de filhos ");
            qtdFilhos = sc.nextInt();

            nomesFilhos[i] = new String[qtdFilhos];

            for (int j = 0; j < nomesFilhos[i].length; j++){
                System.out.print("Nome do filho "+(j+1)+" : ");
                nomesFilhos[i][j] = sc.next();
            }
        }

        for (int i = 0; i < nomesFilhos.length; i++){
            System.out.println("Pessoa "+i+" tem "+nomesFilhos[i].length+" filhos");
            for (int j = 0; j < nomesFilhos[i].length; j++){
                System.out.println(nomesFilhos[i][j]);
            }
        }
    }
}
