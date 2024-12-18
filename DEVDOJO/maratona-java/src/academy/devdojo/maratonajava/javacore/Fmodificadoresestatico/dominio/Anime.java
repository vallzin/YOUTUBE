package academy.devdojo.maratonajava.javacore.Fmodificadoresestatico.dominio;

public class Anime {

    private String nome;
    private static int[] episodios;
//    0 - Bloco de inicialização static é executado quando a JVM
//        carregar a classe
//    1 - Alocado espaço em memória para objeto
//    2 - Cada atributo de classe é criado e inicializado
//        com valores default ou o que for pessado
//    3 - Bloco de inicialização é executado
//    4 - Construtor é executado

    static {
        System.out.println("Dentro do bloco de inicialização static 1");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] += i + 1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicialização static 2");
    }

    static {
        System.out.println("Dentro do bloco de inicialização static 3");
    }

    {
        System.out.println("Dentro do bloco de inicialização não static");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        Anime.episodios = episodios;
    }
}
