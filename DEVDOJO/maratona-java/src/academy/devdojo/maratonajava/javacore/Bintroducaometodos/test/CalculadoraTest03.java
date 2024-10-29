package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado1 = calculadora.divideDoisNumeros(20, 2);
        System.out.println(resultado1);
        System.out.println(calculadora.divideDoisNumeros(20, 2));

        Calculadora calculadora1 = new Calculadora();
        double resultado2 = calculadora1.divideDoisNumeros2(20, 2);
        System.out.println(resultado2);

        Calculadora calculadora2 = new Calculadora();
        double resultado3 = calculadora2.divideDoisNumeros2(20,0);
        System.out.println(resultado3);

        Calculadora calculadora3 = new Calculadora();
        double resultado4 = calculadora3.divideDoisNumeros3(20,0);
        System.out.println(resultado4);


    }
}
