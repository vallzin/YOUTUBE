package com.loiane.cursojava.orientcaoobjeto.exercicioherancapolimorfismo;

public class ContaEspecial extends ContaBancaria{

    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        String s = "Conta Especial\n";
        s += "limite: "+ limite + "\n";
        s += super.toString();
        return s;
    }

    public boolean sacar(double valor){

        double saldoLimite = this.getLimite() + limite;
        if ((saldoLimite - valor) >= 0){
            this.setSaldo(this.getSaldo() - valor);
            return true;
        }
        return false;
    }
}
