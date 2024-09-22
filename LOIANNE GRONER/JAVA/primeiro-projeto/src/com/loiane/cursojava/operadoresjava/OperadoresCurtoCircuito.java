package com.loiane.cursojava.operadoresjava;

public class OperadoresCurtoCircuito {

    public static void main(String[] args) {

        boolean verdadeiro = true;
        boolean falso = false;
        boolean resultado1 = falso & verdadeiro;
        boolean isResultado2 = falso && verdadeiro;//curto circuito
        System.out.println(resultado1);
        System.out.println(isResultado2);

    }

}
