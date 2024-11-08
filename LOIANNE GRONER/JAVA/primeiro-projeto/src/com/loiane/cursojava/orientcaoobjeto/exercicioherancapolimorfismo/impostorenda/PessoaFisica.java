package com.loiane.cursojava.orientcaoobjeto.exercicioherancapolimorfismo.impostorenda;

public class PessoaFisica  extends Contribuinte{
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public double calcularImposto() {

        double renda =this.getContriRenda();

        if (renda <= 1400) {
            return 0;
        } else if ((renda > 1400) && (renda <= 2100)) {
            return (renda * 0.10) - 100;
        } else if ((renda > 2100) && (renda <= 2800)) {
            return (renda * 0.15) - 270;
        } else if ((renda > 2800) && (renda <= 3600)) {
            return (renda * 0.25) - 500;
        }
        return (renda * 0.30) - 700;
    }

    @Override
    public String toString() {
        String s = " Pessoa Física [";
        s += super.toString();
        s += "; cpf: " + this.cpf;
        s += "; imposto a ser pago: " + this.calcularImposto();
        s += "]";

        return s;
    }
}
