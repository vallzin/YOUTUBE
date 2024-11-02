package com.loiane.cursojava.orientcaoobjeto.exercicioaula28a33;



public class LampadaTest {
    public static void main(String[] args) {

        Lampada lamp = new Lampada();

        lamp.ligar();
        lamp.mostrarEstado();
        lamp.desligar();
        lamp.mostrarEstado();
        lamp.isLigada();
        lamp.mostrarEstado();
        lamp.mudarEstado();
        lamp.mostrarEstado();

    }
}

