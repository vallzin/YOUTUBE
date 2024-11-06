package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {

    private double salario;

    public void imprimirPessoa() {
        super.imprimirPessoa();
        System.out.println(this.salario);
    }

    public Funcionario(String nome) {
        //o super deve ser sempre o primeiro nome
        //não pode haver juntos super() e this(),
        // pois ambos devem ser primeira linha
        super(nome);
    }

    public void relatorioPagamento() {
        System.out.println("Eu " + this.nome + " recebi o salário de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
