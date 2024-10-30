package com.loiane.cursojava.orientcaoobjeto.classesmetodos.exercicios;

public class LampadaTest {
    public static void main(String[] args) {

        Lampada lampada = new Lampada();


        lampada.ligar();
        lampada.mostrarEstado();

        lampada.desligar();
        lampada.mostrarEstado();

        lampada.mudarEstado();
        lampada.mostrarEstado();

    }
}
