package com.loiane.cursojava.arrays.exercicios.parte05;

import java.util.Scanner;

public class Aula19Exercicio33 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++){
            System.out.print("Digite os valores do vetor A: ");
            vetorA[i] = sc.nextInt();
        }

        boolean primo = true;
//        String msg;
//        for (int i = 0; i < vetorA.length; i++){
//            primo = true;
//            for (int j = 2; j < vetorA[i]; j++){
//                if (vetorA[i] % j == 0){
//                    primo = false;
//                    break;
//                }
//            }
//
//            msg = "";
//            if (primo){
//                msg = " é primo";
//            }else {
//                msg = " não é primo";
//            }
//            System.out.println(vetorA[i] + msg);
//        }

        for (int i = 0; i < vetorA.length; i++){
            primo = true;
            int number = vetorA[i];

            if(number < 2){
                primo = false;
            }else {
                for(int j = 2; j * j <= number; j++){
                    if (number % j == 0){
                        primo = false;
                        break;
                    }
                }
            }
            String msg = primo ? " é primo " : " não é primo ";
            System.out.println(number + msg);
        }
    }
}
