package com.loiane.cursojava.orientcaoobjeto.exercicioherancapolimorfismo.zoologico;

public class Mamifero extends Animal{

    private String alimMamif;

    public String getAlimMamif() {
        return alimMamif;
    }

    public void setAlimMamif(String alimMamif) {
        this.alimMamif = alimMamif;
    }

    @Override
    public String toString() {

        String s = super.toString();
        s += "\nAlimento: " + this.alimMamif;

        return s;
    }
}
