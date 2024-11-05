package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {

    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Pulga");
        Jogador jogador2 = new Jogador("Saulo Mineiro");
        Time time = new Time("Ceará");

        Jogador[] jogadores = {jogador1, jogador2};

        jogador1.setTime(time);
        jogador2.setTime(time);

//        time.setJogadores(jogadores);
        time.getNomeTime();

        System.out.println("*** --- Jogador --- ***");

        jogador1.imprimirJogador();
        jogador2.imprimirJogador();

        System.out.println("*** --- Time --- ***");

        time.imprimirTime();


    }


}
