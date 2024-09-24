package academy.devdojo.maratonajava.estruturascondicionais;

public class EstruturasCondicionaisExercicio {
    public static void main(String[] args) {
        double salarioAnula = 70000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;

        if(salarioAnula <= 34712){
            valorImposto  = salarioAnula * primeiraFaixa;
        } else if (salarioAnula >= 34713 && salarioAnula <= 68507) {
            valorImposto = salarioAnula * segundaFaixa;
        }else {
            valorImposto = salarioAnula * terceiraFaixa;
        }
        System.out.println(valorImposto);

    }
}
