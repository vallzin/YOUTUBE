package com.loiane.cursojava.orientcaoobjeto.exercicioherancapolimorfismo.zoologico;

public class Peixe  extends Animal{

    private String caractPeixe;

    public Peixe() {
        this.setAniPatas(0);
        this.setAniAmbi("mar");
    }

    public String getCaractPeixe() {
        return caractPeixe;
    }

    public void setCaractPeixe(String caractPeixe) {
        this.caractPeixe = caractPeixe;
    }

    @Override
    public String toString() {

        String s = super.toString();
        s += "\nCaracterísticas: " + this.caractPeixe;

        return s;
    }
}
