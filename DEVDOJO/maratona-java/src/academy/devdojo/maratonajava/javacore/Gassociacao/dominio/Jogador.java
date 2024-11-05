package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Jogador {

    private String nomeJogador;
    private Time time;

    public Jogador(String nome) {
        this.nomeJogador = nome;
    }

//    public Jogador(String nomeJogador, Time time) {
//        this.nomeJogador = nomeJogador;
//        this.time = time;
//    }

    public void imprimirJogador() {
        System.out.println(this.nomeJogador);
        if (time != null){
            System.out.println(time.getNomeTime());
        }
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

}
