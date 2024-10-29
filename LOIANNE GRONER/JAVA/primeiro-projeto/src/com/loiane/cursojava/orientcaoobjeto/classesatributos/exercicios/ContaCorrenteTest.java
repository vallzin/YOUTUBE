package com.loiane.cursojava.orientcaoobjeto.classesatributos.exercicios;

public class ContaCorrenteTest {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();

        cc.titular = "valmilsn";
        cc.contaNumero = 1234568;
        cc.saldo = 10000;
        cc.limite = 3000;

        System.out.println("Titular da Conta Corrente: "+cc.titular);
        System.out.println("Número da Conta Corrente: "+cc.contaNumero);
        System.out.println("Saldo da Conta Corrente R$ "+cc.saldo);
        System.out.println("Limite da Conta Corrente R$ "+cc.limite);
    }

}
