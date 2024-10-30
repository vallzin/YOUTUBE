package com.loiane.cursojava.orientcaoobjeto.classesmetodos.classesatributos;

public class TestCarro {
    public static void main(String[] args) {

        Carro van = new Carro();

        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiro = 10;
        van.capCombustivel = 100;
        van.consCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        System.out.println();

        Carro fusca = new Carro();

        fusca.marca = "VolksWagen";
        fusca.modelo = "Fusca";
        fusca.numPassageiro = 4;
        fusca.capCombustivel = 40;
        fusca.consCombustivel = 1.3;

        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);
    }
}
