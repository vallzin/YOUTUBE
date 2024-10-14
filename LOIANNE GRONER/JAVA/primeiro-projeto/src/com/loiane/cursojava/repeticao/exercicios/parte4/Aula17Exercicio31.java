package com.loiane.cursojava.repeticao.exercicios.parte4;


import java.util.Scanner;

public class Aula17Exercicio31 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean sair = false;
        String continuarCompra;
        int qtdProduto;
        double preco;
        double total;
        double valorPago;
        double troco;
        String output;
        do {
            System.out.print("Deseja informar uma nova compra?S/N ");
            continuarCompra = sc.next();

            if(continuarCompra.equalsIgnoreCase("s")){
                output = "Lojas Tabajara\n";
                System.out.print("Digite a quantidade de produtos da compra ");
                qtdProduto = sc.nextInt();

                total = 0;

                for (int i = 1; i <= qtdProduto; i++){
                    System.out.print("Produto " + i +": R$ ");
                    preco = sc.nextDouble();
                    total += preco;
                    output += "Produto "+i+": "+preco +"\n";
                }

                output += "Total: R$ "+total+"\n";
                System.out.println("Total: R$ "+total+"\n");
                System.out.print("Entre com o valor pago:");
                valorPago = sc.nextDouble();
                output += "Dinheiro: R$ "+valorPago+"\n";
                troco = valorPago - total;
                output += "Troco: R$ "+troco;
                System.out.println(output);
            }else {
                sair = true;
            }


        }while (!sair);


    }
}

