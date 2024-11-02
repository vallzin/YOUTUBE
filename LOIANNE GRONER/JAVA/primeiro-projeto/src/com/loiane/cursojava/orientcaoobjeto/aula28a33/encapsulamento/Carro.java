package com.loiane.cursojava.orientcaoobjeto.aula28a33.encapsulamento;

public class Carro {
    private String marca;//default
    private String modelo;//default
    private int numPassageiros;//default
    private double capCombustivel;//default
    private double consCombustivel;//default

    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consCombustivel = consCombustivel;
    }

    private Carro() {
    }

    public Carro(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Chamando construtor com 3 parâmentros");
    }

    public Carro(String marca, String modelo) {
        this(marca, modelo, 10);
        System.out.println("Chamando construtor com 2 parâmetros");
    }

    //modificadores de acesso getters e setters
    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumPassageiros() {
        return numPassageiros;
    }

    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }

    public double getCapCombustivel() {
        return capCombustivel;
    }

    public void setCapCombustivel(double capCombustivel) {
        this.capCombustivel = capCombustivel;
    }

    public double getConsCombustivel() {
        return consCombustivel;
    }

    public void setConsCombustivel(double consCombustivel) {
        this.consCombustivel = consCombustivel;
    }//fim modificadores de acesso

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
