package com.loiane.cursojava.enumeradores.enumclasse;

public class Teste {

    public static void main(String[] args) {

        DiaSemana dia = DiaSemana.SEGUNDA;

        System.out.println(dia + " - " + dia.getValor());

        Data data = new Data(1, 4, 2024, DiaSemana.DOMINGO);

        System.out.println(data);


    }

}
