package com.loiane.cursojava.orientcaoobjeto.classesmetodossimples;

public class TestCarro {
    public static void main(String[] args) {

        Carro van = new Carro();


        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        van.exibirAutonomia();

    }
}
