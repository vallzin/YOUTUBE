package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {

    private double salario;

    static {
        System.out.println("Dentro do bloco inicialização estático de Funcionário");
    }

    {
        System.out.println("Dentro do bloco inicialização de Funcionário 1");
    }

    {
        System.out.println("Dentro do bloco inicialização de Funcionário 2");
    }

    public Funcionario(String nome) {
        //o super deve ser sempre o primeiro nome
        //não pode haver juntos super() e this(),
        // pois ambos devem ser primeira linha
        super(nome);
        System.out.println("Dentro do construtor de Funcionário");
    }

    public void imprimirPessoa() {
        super.imprimirPessoa();
        System.out.println(this.salario);
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
