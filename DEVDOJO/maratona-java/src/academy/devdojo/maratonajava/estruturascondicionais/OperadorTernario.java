package academy.devdojo.maratonajava.estruturascondicionais;

public class OperadorTernario {
    public static void main(String[] args) {
        double salario = 3000;
        String msgDoar = "Eu vou fazer uma doação";
        String msgNaoDoar = "Eu não vou fazer uma doação";
        //(condição) ? verdadeiro : falso
        String resultado = salario > 5000 ? msgDoar : msgNaoDoar;

        System.out.println(resultado);

    }
}
