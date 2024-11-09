package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class funcionarioTest01 {

    public static void main(String[] args) {

//        Funcionario funcionario = new Funcionario("Zorro",2000);
        Gerente gerente = new Gerente("Fulêro",5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Caguya", 1000);


//        System.out.println(funcionario);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprimi();
        desenvolvedor.imprimi();
    }
}
