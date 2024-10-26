package com.loiane.cursojava.arraymultidimensional.exercicios;

import java.util.Scanner;

public class Aula20Exercicio06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[][] jogoDaVelha = new char[3][3];

        System.out.println("Jogador N°1 = X");
        System.out.println("Jogador N°2 = O");

        boolean ganhou = false;
        int jogada = 1;
        char sinal;
        int linha = 0, coluna = 0;

        while (!ganhou) {
            if(jogada % 2 == 1){
                System.out.println("Vez do jogador N°1");
                sinal = 'X';
            }else {
                System.out.println("Vez do jogador N°2");
                sinal = 'O';
            }

            boolean linhaValida = false;
            while (!linhaValida){
                System.out.print("Entre com a linha ( 1, 2, 3): ");
                linha = sc.nextInt();
                if (linha >= 1 && linha <= 3){
                    linhaValida = true;
                }else {
                    System.out.print("Entrada inválida, tente novamente");
                }
            }

            boolean colunaValida = false;
            while (!colunaValida){
                System.out.print("Entre com a coluna ( 1, 2, 3): ");
                coluna = sc.nextInt();
                if (coluna >= 1 && coluna <= 3){
                    colunaValida = true;
                }else {
                    System.out.print("Entrada inválida, tente novamente");
                }
            }

            linha--;
            coluna--;
            if(jogoDaVelha[linha][coluna] == 'X' || jogoDaVelha[linha][coluna] == 'O'){
                System.out.println("Posição já usada, tente novamente");
            }else {
                jogoDaVelha[linha][coluna] = sinal;
                jogada++;
            }

            //impressão do tabuleiro
            for (int i = 0; i < jogoDaVelha.length; i++){
                for (int j = 0; j < jogoDaVelha[i].length; j++){
                    System.out.print(jogoDaVelha[i][j]+ " | ");
                }
                System.out.println();
            }

            //verificar se tem ganhador
            if (
                   (jogoDaVelha[0][0] == 'X' && jogoDaVelha[0][1] == 'X' &&jogoDaVelha[0][2] == 'X')
                || (jogoDaVelha[1][0] == 'X' && jogoDaVelha[1][1] == 'X' &&jogoDaVelha[1][2] == 'X')
                || (jogoDaVelha[2][0] == 'X' && jogoDaVelha[2][1] == 'X' &&jogoDaVelha[2][2] == 'X')
                || (jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][0] == 'X' &&jogoDaVelha[2][0] == 'X')
                || (jogoDaVelha[0][1] == 'X' && jogoDaVelha[1][1] == 'X' &&jogoDaVelha[2][1] == 'X')
                || (jogoDaVelha[0][2] == 'X' && jogoDaVelha[1][2] == 'X' &&jogoDaVelha[2][2] == 'X')
                || (jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][1] == 'X' &&jogoDaVelha[2][2] == 'X')
                || (jogoDaVelha[0][2] == 'X' && jogoDaVelha[1][1] == 'X' &&jogoDaVelha[2][0] == 'X')
                ){
                System.out.println("Vitótia do jogador N°1");
                ganhou = true;
            }else if (
                    (jogoDaVelha[0][0] == 'O' && jogoDaVelha[0][1] == 'O' &&jogoDaVelha[0][2] == 'O')
                    || (jogoDaVelha[1][0] == 'O' && jogoDaVelha[1][1] == 'O' &&jogoDaVelha[1][2] == 'O')
                    || (jogoDaVelha[2][0] == 'O' && jogoDaVelha[2][1] == 'O' &&jogoDaVelha[2][2] == 'O')
                    || (jogoDaVelha[0][0] == 'O' && jogoDaVelha[1][0] == 'O' &&jogoDaVelha[2][0] == 'O')
                    || (jogoDaVelha[0][1] == 'O' && jogoDaVelha[1][1] == 'O' &&jogoDaVelha[2][1] == 'O')
                    || (jogoDaVelha[0][2] == 'O' && jogoDaVelha[1][2] == 'O' &&jogoDaVelha[2][2] == 'O')
                    || (jogoDaVelha[0][0] == 'O' && jogoDaVelha[1][1] == 'O' &&jogoDaVelha[2][2] == 'O')
                    || (jogoDaVelha[0][2] == 'O' && jogoDaVelha[1][1] == 'O' &&jogoDaVelha[2][0] == 'O')
            ){
                System.out.println("Vitótia do jogador N°2");
                ganhou = true;
            } else if (jogada > 9) {
                System.out.println("Jogo sem vencedores");
                ganhou = true;
            }
        }
    }
}
