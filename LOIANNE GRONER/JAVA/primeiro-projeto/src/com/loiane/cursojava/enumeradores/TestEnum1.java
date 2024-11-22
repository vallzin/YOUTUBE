package com.loiane.cursojava.enumeradores;

import com.loiane.cursojava.enumeradores.enumclasse.DiaSemana;

import javax.xml.transform.Source;

public class TestEnum1 {
    public static void main(String[] args) {

        DiaSemana dias;

        System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));

        DiaSemana dia = Enum.valueOf(DiaSemana.class, "TERCA");
        System.out.println(dia);


    }
}
