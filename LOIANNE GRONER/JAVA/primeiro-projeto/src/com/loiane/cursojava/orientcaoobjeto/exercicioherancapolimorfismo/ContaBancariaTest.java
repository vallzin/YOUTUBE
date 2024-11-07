package com.loiane.cursojava.orientcaoobjeto.exercicioherancapolimorfismo;

import java.util.Scanner;

public class ContaBancariaTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ContaBancaria contaSimples = new ContaBancaria();

        double valor;


        boolean bandeira = false;
        do {


            System.out.println("Menu Conta Bancária:");
            System.out.println("digite 'c' para criar conta bancária");
            System.out.println("digite 'e' ==> extrato");
            System.out.println("digite 'd' ==> depositar");
            System.out.println("digite 's' ==> sacar");
            System.out.println("digite 'r' ==> sair");
            char opcao = sc.next().charAt(0);
            sc.nextLine();

            switch (opcao) {

                case 'c':

                    System.out.println("Cadastrando cliente no Banco");
                    System.out.print("Digite seu nome: ");
                    contaSimples.setNomeCliente(sc.nextLine());
                    System.out.print("Digite o número da conta: ");
                    contaSimples.setNumConta(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Deseja fazer um deposito agora? 's' ou 'n' ");
                    char depositoAgora = sc.next().charAt(0);

                    if (depositoAgora == 's') {
                        System.out.print("Digite o valor do depósito: ");
                        double valorDeposito = sc.nextDouble();
                        sc.nextLine();
                        contaSimples.depositar(valorDeposito);
                        System.out.println();
                    }

                    System.out.println("Conta Bancária criada com sucesso");
                    System.out.println();
                    break;

                case 'd':

                    System.out.print("Digite o valor do depósito: ");
                    double valorDeposito = sc.nextDouble();
                    contaSimples.depositar(valorDeposito);
                    System.out.println();
                    break;

                case 's':

                    valor = 0;
                    System.out.print("Digite o número da conta: ");
                    int contaNum = sc.nextInt();
                    sc.nextLine();
                    if (contaNum == contaSimples.getNumConta()) {
                        System.out.print("Digite o valor a ser sacado: ");
                        valor = sc.nextDouble();
                        sc.nextLine();
                        realizarSaque(contaSimples, valor);
                    } else {
                        System.out.println("Informação errada, tente novamente");
                    }
                    break;

                case 'e':

                    System.out.println(contaSimples.toString());
                    break;

                case 'r':

                    System.out.println("Saindo do sistema...");
                    bandeira = true;
                    break;
            }

        } while (!bandeira);

        sc.close();

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
