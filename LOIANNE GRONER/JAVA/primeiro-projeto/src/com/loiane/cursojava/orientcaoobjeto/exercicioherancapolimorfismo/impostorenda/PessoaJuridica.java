package com.loiane.cursojava.orientcaoobjeto.exercicioherancapolimorfismo.impostorenda;

public class PessoaJuridica extends Contribuinte{

    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public double calcularImposto() {
//        return (this.getContriRenda() * 10)/ 100;
        return this.getContriRenda() * 0.1;
    }

    @Override
    public String toString() {
        String s =" Pessoa Jurídica [";
        s += super.toString();
        s += "; cnpj: " + this.cnpj;
        s += "; imposto a ser pago: " + this.calcularImposto();
        s += "]";

        return s;
    }
}
