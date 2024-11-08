package com.loiane.cursojava.orientcaoobjeto.exercicioherancapolimorfismo.impostorenda;

import java.util.Arrays;

public abstract class Contribuinte {

    private String contribNome;
    private double contriRenda;

    public double getContriRenda() {
        return contriRenda;
    }

    public void setContriRenda(double contriRenda) {
        this.contriRenda = contriRenda;
    }

    public String getContribNome() {
        return contribNome;
    }

    public void setContribNome(String contribNome) {
        this.contribNome = contribNome;
    }

    public abstract double calcularImposto();

    @Override
    public String toString() {
        String s = " Nome: " + this.getContribNome();
        s += "; renda bruta: " + this.getContriRenda();

        return s;


    }
}
