package com.loiane.cursojava.orientcaoobjeto.exercicioherancapolimorfismo.zoologico;

public class Animal {

    private String aniNome;
    private double aniComp;
    private int aniPatas;
    private String aniCor;
    private String aniAmbi;
    private double aniVelo;

    public Animal() {
        this.setAniPatas(4);
    }

    public String getAniCor() {
        return aniCor;
    }

    public void setAniCor(String aniCor) {
        this.aniCor = aniCor;
    }

    public String getAniNome() {
        return aniNome;
    }

    public void setAniNome(String aniNome) {
        this.aniNome = aniNome;
    }

    public double getAniComp() {
        return aniComp;
    }

    public void setAniComp(double aniComp) {
        this.aniComp = aniComp;
    }

    public int getAniPatas() {
        return aniPatas;
    }

    public void setAniPatas(int aniPatas) {
        this.aniPatas = aniPatas;
    }

    public String getAniAmbi() {
        return aniAmbi;
    }

    public void setAniAmbi(String aniAmbi) {
        this.aniAmbi = aniAmbi;
    }

    public double getAniVelo() {
        return aniVelo;
    }

    public void setAniVelo(double aniVelo) {
        this.aniVelo = aniVelo;
    }

    @Override
    public String toString() {

        String s = "------------------\n";
              s += "Animal: " + this.aniNome+"\n";
              s += "Comprimento: "+ this.aniComp+"cm\n";
              s += "Patas: " + this.aniPatas+"\n";
              s += "Cor: " + this.aniCor+"\n";
              s += "Ambiente: " + this.aniAmbi+"\n";
              s += "Velocidade: " + this.aniVelo+" m/s";

        return s;
    }
}
