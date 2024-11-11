package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadorImposto;

public class ProdutoTest02 {

    public static void main(String[] args) {

        Produto prod = new Computador("Rayzen 9", 3000);

        System.out.println(prod.getNome());
        System.out.println(prod.getValor());
        System.out.println(prod.calcularImposto());
        System.out.println("--------------------");

        Produto tomate = new Tomate("Tomate verde", 8);

        System.out.println(tomate.getNome());
        System.out.println(tomate.getValor());
        System.out.println(tomate.calcularImposto());





    }
}
