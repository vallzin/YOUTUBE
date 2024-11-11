package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadorImposto {

//    public static void calcularImpostoComputador(Computador computador){
//        System.out.println("Relatório de imposto do computador");
//        double imposto = computador.calcularImposto();
//        System.out.println("Imposto do computador " + computador.getNome());
//        System.out.println("Valor "+ computador.getValor());
//        System.out.println("Imposto a ser pago: "+imposto);
//    }
//
//    public static void calcularImpostoTomate(Tomate tomate){
//        System.out.println("Relatório de imposto do tomate");
//        double imposto = tomate.calcularImposto();
//        System.out.println("Imposto do tomate " + tomate.getNome());
//        System.out.println("Valor "+ tomate.getValor());
//        System.out.println("Imposto a ser pago: "+imposto);
//    }

    //Uso do polimorfismo, criação de um método genérico
    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        //usando instanceof
//        if (produto instanceof Tomate) {
//            Tomate tomate = (Tomate) produto;
//            System.out.println(tomate.getDataValidade());
//        }
        //segunda forma de usar o instanceof
//        if (produto instanceof Tomate){
//            System.out.println(((Tomate) produto).getDataValidade());
//        }
        if (produto instanceof Tomate){
            String dataValidade = ((Tomate) produto).getDataValidade();
            System.out.println(dataValidade);
        }
    }

}
