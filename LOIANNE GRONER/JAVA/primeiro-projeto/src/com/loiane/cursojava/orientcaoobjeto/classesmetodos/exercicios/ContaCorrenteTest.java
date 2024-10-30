package com.loiane.cursojava.orientcaoobjeto.classesmetodos.exercicios;

public class ContaCorrenteTest {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();

        cc.numero = "123456789";
        cc.agencia = "12345";
        cc.especial = true;
        cc.limiteEspecial = 500;
        cc.valorEspecialUsado = 0;
        cc.saldo = 100;

        System.out.println("Saldo da conta "+cc.saldo+" = "+cc.saldo);

        boolean saqueEfetuado = cc.realizarSaque(10);

        if (saqueEfetuado){
            System.out.println("Saque efetuado com sucesso");
            cc.consultarSaldo();
        }else {
            System.out.println("Não foi possível realizar saque. Saldo insuficiente");
        }

        boolean saqueEfetuado1 = cc.realizarSaque(1000);
        if (saqueEfetuado1){
            System.out.println("Saque efetuado com sucesso");
            cc.consultarSaldo();
        }else {
            System.out.println("Não foi possível realizar saque. Saldo insuficiente");
        }

        System.out.println("Depósito de 500 reais");
        cc.depositar(500);
        cc.consultarSaldo();

        cc.realizarSaque(1000);
        cc.consultarSaldo();

        if (cc.verificarUsoChequeEspecial()){
            System.out.println("Usando cheque especial");
        }else {
            System.out.println("Não está usando cheque especial");
        }


    }
}

