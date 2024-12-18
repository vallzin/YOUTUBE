package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Pessoa {

    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("Dentro do bloco inicialização estático de Pessoa");
    }

    {
        System.out.println("Dentro do bloco inicialização de Pessoa 1");
    }

    {
        System.out.println("Dentro do bloco inicialização de Pessoa 2");
    }

    public Pessoa(String nome){
        System.out.println("Dentro do construtor Pessoa");
        this.nome = nome;
    }

    public Pessoa(String nome, String cpf){
        this(nome);
        this.cpf = cpf;
    }

    public void imprimirPessoa(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua()+" cep: "+this.endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
