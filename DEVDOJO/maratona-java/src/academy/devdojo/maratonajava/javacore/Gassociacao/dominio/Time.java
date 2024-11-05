package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Time {

    private String nomeTime;
    private Jogador[] jogadores;

    public Time(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public Time(String nomeTime, Jogador[] jogadores) {
        this.nomeTime = nomeTime;
        this.jogadores = jogadores;
    }

    public void imprimirTime(){
        System.out.println(this.nomeTime);
        if (jogadores == null) return;
        for (Jogador jogador : jogadores){
            System.out.println(jogador.getNomeJogador());
        }
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }
}
