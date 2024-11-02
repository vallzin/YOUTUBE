package com.loiane.cursojava.orientcaoobjeto.aula28a33.construtores;

public class Carro {
    public String marca;
    public String modelo;
    public int numPassageiros;
    public double capCombustivel;
    public double consCombustivel;

    Carro(){
        System.out.println("Classe carro foi intanciada");
        numPassageiros = 4;
    }

    Carro(String marca_, String modelo_, int numPassageiros_,double capCombustivel_, double consCombustivel_ ){
        marca = marca_;
        modelo = modelo_;
        numPassageiros = numPassageiros_;
        capCombustivel = capCombustivel_;
        consCombustivel = consCombustivel_;
    }


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
