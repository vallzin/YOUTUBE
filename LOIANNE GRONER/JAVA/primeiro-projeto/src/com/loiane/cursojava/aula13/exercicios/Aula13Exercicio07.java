package com.loiane.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Aula13Exercicio07 {
    /*
    * Faça um programa que calcule a área de um quadrado,
    * em seguida mostre o dobro desta área para o usuário
    * o dobro da área.
    * */

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Dobro da área do quadrado");
        System.out.print("Digite o valor do lado: ");
        double lado = sc.nextDouble();
        sc.close();
//        double areaQaud = lado * lado;
        double areaQuad = Math.pow(lado, 2);
        double dobroArea = areaQuad * 2;
        System.out.println("O dobro da área do quadrado é " + dobroArea);
    }


}
