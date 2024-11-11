package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadorImposto;

public class ProdutoTest01 {

    public static void main(String[] args) {

        Computador comp = new Computador("NUC10i7", 11000);

        Tomate tomate = new Tomate("Tomate Siciliano", 10);

        CalculadorImposto.calcularImpostoComputador(comp);
        System.out.println("-*- ----------------- -*-");
        CalculadorImposto.calcularImpostoCTomate(tomate);



    }
}
