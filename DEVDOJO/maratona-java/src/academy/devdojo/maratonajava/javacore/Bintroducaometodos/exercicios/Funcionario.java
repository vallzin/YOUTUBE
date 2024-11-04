package academy.devdojo.maratonajava.javacore.Bintroducaometodos.exercicios;

public class Funcionario {

    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

//    public void imprimir1(){
//        System.out.println(this.nome);
//        System.out.println(this.idade);
//        System.out.println(this.salarios[0]);
//        System.out.println(this.salarios[1]);
//        System.out.println(this.salarios[2]);
//    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }

    //  refatoração do método imprimir1
    public void imprimir2(){

        if (salarios == null){return;}

        System.out.println(this.nome);
        System.out.println(this.idade);

        for (double salario : salarios){
            System.out.print(salario+" ");
        }
        //chamando o método para cria um pequeno relatório
        ImprimirMediaSalario();

    }


    public void ImprimirMediaSalario(){

        if (salarios == null) {return;}

        double soma = 0;

        for (double salario : salarios) {
            soma += salario;
        }

        media = soma / salarios.length;

        System.out.println("\nMédia salarial " + media);

        }
}
