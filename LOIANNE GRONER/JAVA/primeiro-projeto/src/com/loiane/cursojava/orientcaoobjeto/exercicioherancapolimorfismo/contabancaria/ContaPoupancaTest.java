package com.loiane.cursojava.orientcaoobjeto.exercicioherancapolimorfismo.contabancaria;

import java.util.Scanner;

public class ContaPoupancaTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ContaPoupanca poupanca = new ContaPoupanca();
        poupanca.setNomeCliente("cliente conta poupança");
        poupanca.setNumConta(22356);
        poupanca.setDiaRendimento(7);

        poupanca.depositar(100);
        System.out.println("Saldo: "+poupanca.getSaldo());
        realizarSaque(poupanca, 50);

        realizarSaque(poupanca, 70);

        System.out.println(poupanca);

        if(poupanca.calcularNovoSaldo(0.5)){
            System.out.println("Rendimento aplicado");
            System.out.println("novo saldo é de "+ poupanca.getSaldo());
        }else {
            System.out.println("Não é dia de rendimento");
            System.out.println("Saldo continua o mesmo");
        }




    }


    private static void realizarSaque(ContaBancaria conta, double valor) {
        if (conta.sacar(valor)) {
            System.out.println("Saque efetuado com sucesso\n");
            System.out.println("novo Saldo: " + conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para sacar R$ " + valor + ";");
            System.out.println("Saldo em conta: " + conta.getSaldo());
        }
    }


}
