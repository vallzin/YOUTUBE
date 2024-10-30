package com.loiane.cursojava.orientcaoobjeto.classesmetodossimples;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consCombustivel;

    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: "+ capCombustivel * consCombustivel + "Km");
    }


}
