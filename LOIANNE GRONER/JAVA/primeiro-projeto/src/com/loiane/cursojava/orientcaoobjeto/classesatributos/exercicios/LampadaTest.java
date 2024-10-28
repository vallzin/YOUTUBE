package com.loiane.cursojava.orientcaoobjeto.classesatributos.exercicios;

public class LampadaTest {

    public static void main(String[] args) {

        Lampada lampada = new Lampada();

        lampada.modelo = "LED bolinha";
        lampada.tensao = "Bivolt";
        lampada.corLuz = "Âmbar";
        lampada.potencia = 2;
        lampada.fluxoLuminoso = 200;
        lampada.TempCor = 2400;
        lampada.vidaUtil = 20000;

        lampada.tipos = new String[3];
        lampada.tipos[0] = "lâmpada LED filamentos";
        lampada.tipos[1] = "lâmpada LED Dicróica";
        lampada.tipos[2] = "lâmpada LED Bulbo";

        System.out.println(lampada.corLuz);
        System.out.println(lampada.fluxoLuminoso);
        System.out.println(lampada.tensao);
        System.out.println(lampada.TempCor);
        System.out.println(lampada.vidaUtil);
        System.out.println(lampada.potencia);
        System.out.println(lampada.tipos[0]);
        System.out.println(lampada.tipos[1]);
        System.out.println(lampada.tipos[2]);
    }
}
