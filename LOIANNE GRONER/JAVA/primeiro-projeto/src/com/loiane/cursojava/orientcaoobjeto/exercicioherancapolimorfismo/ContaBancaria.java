package com.loiane.cursojava.orientcaoobjeto.exercicioherancapolimorfismo;

public class ContaBancaria {

    private String nomeCliente;
    private int numConta;
    private double saldo;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public boolean sacar(double valor){
        if (saldo - valor >= 0){
            saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String s = "";
        s += "Cliente: "+ nomeCliente + "\n";
        s += "Conta:   "+ numConta + "\n";
        s += "Saldo:   "+ saldo + "\n";

        return s;
    }


}
