package com.loiane.cursojava.orientcaoobjeto.classesmetodos.exercicios;

public class ContaCorrente {

    String  numero;
    String agencia;
    boolean especial;
    double limiteEspecial;
    double valorEspecialUsado;
    double saldo;

    boolean realizarSaque(double quantiaASacar) {
        //tem saldo na conta
        if (saldo >= quantiaASacar) {
            saldo -= quantiaASacar;
            return true;
        } else {
            if (especial) {
                double limite = limiteEspecial + saldo;
                if (limite >= quantiaASacar){
                    saldo -= quantiaASacar;
                    return true;
                }else {
                    return false;
                }
            }else{
                return false;
            }
        }
    }

    void depositar(double valorDepositado){
        saldo += valorDepositado;
    }

    void consultarSaldo(){
        System.out.println("Saldo atual da conta é "+saldo);
    }

    boolean verificarUsoChequeEspecial(){
        return saldo < 0;
    }
}
