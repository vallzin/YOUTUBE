package academy.devdojo.maratonajava.javacore.Bintroducaometodos.exercicios;

public class Funcionario {

    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime(){

        if (salarios == null){return;}

        System.out.println(this.nome);
        System.out.println(this.idade);

        for (double salario : salarios){
            System.out.println(salario+" ");
        }
        ImprimeMediaSalario();

    }


    public void ImprimeMediaSalario(){

        if (salarios == null) {return;}

        double soma = 0;
        double media = 0;

        for (double salario : salarios) {
            soma += salario;
        }

        media = soma / salarios.length;
        System.out.println("\nMédia salarial " + media);

        }
}
