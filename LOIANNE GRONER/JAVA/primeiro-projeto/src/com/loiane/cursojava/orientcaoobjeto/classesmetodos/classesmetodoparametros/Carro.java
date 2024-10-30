package com.loiane.cursojava.orientcaoobjeto.classesmetodos.classesmetodoparametros;

public class Carro {

    public String marca;
    public String modelo;
    public int numPassageiros;
    public double capCombustivel;
    public double consCombustivel;

    public void exibirAutonomia(){
        System.out.println("A autonomia do carro é: "+ capCombustivel * consCombustivel + "Km");
    }

    double obterAutonomia(){
        System.out.println("Método obterAutonomia foi chamado");
        return capCombustivel * consCombustivel;
    }

    double calcularCombustivel(double km){
        double qtdCombustivel = km / consCombustivel;
        return qtdCombustivel;
    }


}
