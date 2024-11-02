package com.loiane.cursojava.orientcaoobjeto.aula28a33.exercicios;

import java.util.Scanner;

public class JogoDaVelhaTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        JogoDaVelha jgVelha = new JogoDaVelha();

        System.out.println("Jogador N°1 = X");
        System.out.println("Jogador N°2 = O");

        boolean ganhou = false;
        char sinal;
        int linha = 0, coluna = 0;

        while (!ganhou){
            if (jgVelha.vezJogador1()){
                System.out.println("Vez do jogador 1. Escolha linha e coluna (1 - 3)");
                sinal = 'X';
            }else {
                System.out.println("Vez do jogador 2. Escolha linha e coluna (1 - 3)");
                sinal = 'O';
            }

            linha = valor("Linha ", sc);
            coluna = valor("Coluna", sc);

            if (!jgVelha.validarJogada(linha, coluna, sinal)){
                System.out.println("Posição já usada, tente novamente");
            }

            jgVelha.imprimirTabueliro();

            if (jgVelha.verificarGanhador('X')){
                ganhou = true;
                System.out.println("Parabéns, jogador 1 ganhou!");
            }else if (jgVelha.verificarGanhador('O')){
                ganhou = true;
                System.out.println("Parabéns, jogador 2 ganhou!");
            }else if (jgVelha.getJogada() > 9){
                ganhou = true;
                System.out.println("Ninguém sagrou-se vencedor");
            }
        }

    }

    static int valor(String tipoValor, Scanner sc){
        int valor = 0;
        boolean valorValido = false;
        while (!valorValido){
            System.out.print("Entre com a "+tipoValor+" ( 1, 2, 3): ");
            valor = sc.nextInt();
            if (valor >= 1 && valor <= 3){
                valorValido = true;
            }else {
                System.out.print("Entrada inválida, tente novamente");
            }
        }
        valor--;
        return valor;
    }
}
