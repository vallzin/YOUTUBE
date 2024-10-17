package com.loiane.cursojava.aula13.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Aula13Exercicio18 {
    /*Faça um programa que peça o tamanho de um arquivo para
    download (em MB) e a velocidade de um link de Internet
    (em Mbps), calcule e informe o tempo aproximado de download
    do arquivo usando este link (em minutos).
    */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do arquivo em MB para download: ");
        double arqDownload = sc.nextDouble();
        System.out.println("Digite a velocidade da internet em Mbps: ");
        double veloInternet = sc.nextDouble();
        double veloDownload = arqDownload / veloInternet;
        System.out.println("O tempo aproximando do download do arquivo é: " + veloDownload);

    }
}
