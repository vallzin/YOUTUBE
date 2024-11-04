package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {

    private String nome;
    private int idade;

//  Assinatura de um método é um contrato
    public void ImprimirPessoa(){
//        forma correta de acesso para impressão
//        System.out.println(this.nome);
//      não usar dessa forma
        System.out.println(getNome());
//        forma correta de acesso para impressão
//        System.out.println(this.idade);
//      não usar dessa forma
        System.out.println(getIdade());
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        if(idade < 0){
            System.out.println("Idade inválida");
            return;
        }
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }

}
