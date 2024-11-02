package com.loiane.cursojava.orientcaoobjeto.variaveisemetodosestaticos.exercicios;

public class CalculadoraFatorial {

    public static int soma(int num1, int num2){
        return num1 + num2;
    }

    public static int subtrair(int num1, int num2){
        return num1 - num2;
    }

    public static int multiplicar(int num1, int num2){
        return num1 * num2;
    }

    public static int dividir(int num1, int num2){
        return num1 / num2;
    }

    public static int potencia(int num1, int num2){
        return (int) Math.pow(num1, num2);
    }

    public static int potencia1(int num1, int num2){

        int total = 1;
        for (int i = 1; i <= num2; i++){
            total *= num1;

        }
        return total;
    }

    public static int Fatorial(int num){

        if(num == 0){
            return 1;
        }
        int total = 1;
        for (int i = num; i > 1; i--){
            total *= i;
        }
        return total;
    }





}
