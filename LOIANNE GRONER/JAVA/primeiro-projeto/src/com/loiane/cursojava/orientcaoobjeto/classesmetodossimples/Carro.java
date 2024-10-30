package com.loiane.cursojava.orientcaoobjeto.classesmetodossimples;

public class Carro {

    public String marca;
    public String modelo;
    public int numPassageiros;
    public double capCombustivel;
    public double consCombustivel;

    public void exibirAutonomia(){
        System.out.println("A autonomia do carro é: "+ capCombustivel * consCombustivel + "Km");
    }


}
