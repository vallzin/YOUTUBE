package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadorImposto;

public class ProdutoTest03 {

    public static void main(String[] args) {

        Produto prod = new Computador("Rayzen 9", 3000);


        Tomate tomate = new Tomate("Tomate verde", 8);
        tomate.setDataValidade("11/12/2023");
        CalculadorImposto.calcularImposto(tomate);
        System.out.println("-------------------------------");
        CalculadorImposto.calcularImposto(prod);







    }
}
