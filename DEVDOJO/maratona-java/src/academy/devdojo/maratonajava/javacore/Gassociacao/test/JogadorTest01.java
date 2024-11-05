package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {

    public static void main(String[] args) {

        Jogador j1 = new Jogador("Pelé");
        Jogador j2 = new Jogador("Romário");
        Jogador j3 = new Jogador("Cafú");

        Jogador[] jogadores = {j1, j2, j3};

        for (Jogador j : jogadores){
            j.imprimirJogador();
        }

    }

}
