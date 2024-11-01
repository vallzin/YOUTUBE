package com.loiane.cursojava.orientcaoobjeto.construtores;

public class Carro3 {
    public String marca;
    public String modelo;
    public int numPassageiros;
    public double capCombustivel;
    public double consCombustivel;

    public Carro3(String marca, String modelo, int numPassageiros, double capCombustivel, double consCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consCombustivel = consCombustivel;
    }

    public Carro3() {
    }

    public Carro3(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Chamando construtor com 3 parâmentros");
    }

    public Carro3(String marca, String modelo) {
        this(marca, modelo, 10);
        System.out.println("Chamando construtor com 2 parâmetros");
    }

    public void exibirAutonomia(){
        System.out.println("A autonomia do carro é: "+ this.capCombustivel * this.consCombustivel + "Km");
    }

    double obterAutonomia(){
        System.out.println("Método obterAutonomia foi chamado");
        return this.capCombustivel * this.consCombustivel;
    }

    double calcularCombustivel(double km){
        double qtdCombustivel = km / this.consCombustivel;
        return qtdCombustivel;
    }

}
