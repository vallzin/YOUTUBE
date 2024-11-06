package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {

    public static void main(String[] args) {

        Endereco end = new Endereco();
        end.setRua("Rua X");
        end.setCep("0123456-789");

        Pessoa pessoa = new Pessoa("Uzumaki Naruto");
        pessoa.setCpf("12312312123");
        pessoa.setEndereco(end);

        pessoa.imprimirPessoa();

        Endereco end1 = new Endereco();
        end1.setRua("Rua II");
        end1.setCep("0126-789");

        Funcionario func = new Funcionario("Joaquim");
        func.setCpf("45454546545");
        func.setEndereco(end1);
        func.setSalario(12345);
        System.out.println("-*- --------- -*-");
        func.imprimirPessoa();

    }

}
