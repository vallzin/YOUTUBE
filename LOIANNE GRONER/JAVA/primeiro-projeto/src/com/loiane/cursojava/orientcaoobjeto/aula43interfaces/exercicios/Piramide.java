package com.loiane.cursojava.orientcaoobjeto.aula43interfaces.exercicios;

public class Piramide extends Figura3D{

    private double altura;
    private double arestaBase;
    private double apotema;
    private int numPoliBase;

    public int getNumPoliBase() {
        return numPoliBase;
    }

    public void setNumPoliBase(int numPoliBase) {
        this.numPoliBase = numPoliBase;
    }

    private Figura2D base;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArestaBase() {
        return arestaBase;
    }

    public void setArestaBase(double arestaBase) {
        this.arestaBase = arestaBase;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public Figura2D getBase() {
        return base;
    }

    public void setBase(Figura2D base) {
        this.base = base;
    }

    @Override
    public double calcularArea() {
        if(base != null) {
            return (numPoliBase * ((arestaBase * altura) / 2)) + base.calcularArea();
        }
    }

    @Override
    public double calcularVolume() {
        if(base != null){
            return (base.calcularArea() * altura) / 3;
        }

        return 0;
    }
}
