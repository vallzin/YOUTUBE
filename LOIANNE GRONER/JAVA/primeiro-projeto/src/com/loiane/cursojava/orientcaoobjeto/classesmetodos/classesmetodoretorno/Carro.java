package com.loiane.cursojava.orientcaoobjeto.classesmetodos.classesmetodoretorno;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consCombustivel;

    void exibirAutonomia(){

        System.out.println("A autonomia do carro é: "+ capCombustivel * consCombustivel + "Km");
    }

    double obterAutonomia(){
        System.out.println("Método obterAutonomia foi chamado");
        return capCombustivel * consCombustivel;
    }


}
