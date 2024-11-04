package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {

    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    public Anime(){
        System.out.println("Dentro do contrutor sem argumentos");
    }
//  Ao chamar um construtor dentro de outro,
//  ele, o construtor, tem que ser 'obrigatoriamente'
//  chamado na primeira linha
    public Anime(String nome, String tipo, int episodios, String genero){
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }
//  A forma 'this()', que é para chamar construtor dentro
//  dentro de outro construtor, só funciona dentro de construtores
    public Anime(String nome, String tipo, int episodios, String genero, String estudio){
        this(nome, tipo, episodios, genero);
        this.estudio = estudio;
    }

//    public void init(String nome, String tipo, int episodios){
//        this.nome = nome;
//        this.tipo = tipo;
//        this.episodios = episodios;
//    }
//
//
////  Sobrecarga de métodos
//    public void init(String nome, String tipo, int episodios, String genero){
//         this.init(nome, tipo, episodios);
//        this.genero = genero;
//}

    public void imprimirAnime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }

}
