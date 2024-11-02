package com.loiane.cursojava.orientcaoobjeto.variaveisemetodosestaticos.exercicios;

public class ContadorTest {

    static void imprimirValor(){
        System.out.println(Contador.obterValor());
    }

    public static void main(String[] args) {
        //métodos ou classe static não precisam ser instanciados

        Contador cont = new Contador();
        Contador cont1 = new Contador();
        Contador cont2 = new Contador();

        imprimirValor();

        Contador.incrementar();

        imprimirValor();

        Contador.zerar();

        imprimirValor();

    }
}
