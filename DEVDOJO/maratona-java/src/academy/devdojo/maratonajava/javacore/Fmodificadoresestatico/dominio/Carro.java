package academy.devdojo.maratonajava.javacore.Fmodificadoresestatico.dominio;

public class Carro {
    private String nome;
    private double velocidadeMax;
//    modificador de acesso 'static' sempre vem antes do tipo
//    o atributo pertence a classe e não mais ao objeto
    private static double velocidadeLim = 250;

    public Carro(String nome, double velocidadeMax){
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;
    }

    public void imprimirCarro(){
        System.out.println("***----------------------***");
        System.out.println("Nome: "+this.nome);
        System.out.println("Velocidade Máxima: "+this.velocidadeMax);
        System.out.println("Velocidade Limite: "+Carro.velocidadeLim);
    }

    public static void setVelocidadeLim(double velocidadeLim){
        Carro.velocidadeLim = velocidadeLim;
    }

    public static double getVelocidadeLim(){
        return velocidadeLim;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

}
