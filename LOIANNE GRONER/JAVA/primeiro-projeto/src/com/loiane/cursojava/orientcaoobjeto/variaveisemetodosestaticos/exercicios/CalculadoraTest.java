package com.loiane.cursojava.orientcaoobjeto.variaveisemetodosestaticos.exercicios;

public class CalculadoraTest {
    public static void main(String[] args) {

        imprimirNaTela(Calculadora.soma(1, 2));
        imprimirNaTela(Calculadora.subtrair(3, 1));
        imprimirNaTela(Calculadora.multiplicar(2,4));
        imprimirNaTela(Calculadora.dividir(10, 2));
        imprimirNaTela(Calculadora.potencia(3, 2));
        imprimirNaTela(Calculadora.potencia1(2,3));

    }

    static void imprimirNaTela(int num){
        System.out.println(num);
    }

}
