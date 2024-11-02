package com.loiane.cursojava.orientcaoobjeto.variaveisemetodosestaticos.exercicios;

public class Contador {

    private static int contador;

    public Contador(){
        contador++;
    }

    public static void incrementar(){
        contador++;
    }

    public static void zerar(){
        contador = 0;
    }

    public static int obterValor(){
        return contador;
    }


}
