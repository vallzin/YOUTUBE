package academy.devdojo.maratonajava.javacore.Bintroducaometodos.exercicios;

public class Funcionario {

    public String nome;
    public int idade;
    public double[] salarios;

//    public void imprimir1(){
//        System.out.println(this.nome);
//        System.out.println(this.idade);
//        System.out.println(this.salarios[0]);
//        System.out.println(this.salarios[1]);
//        System.out.println(this.salarios[2]);
//    }

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

        double media = soma / salarios.length;
        System.out.println("\nMédia salarial " + media);

        }
}
