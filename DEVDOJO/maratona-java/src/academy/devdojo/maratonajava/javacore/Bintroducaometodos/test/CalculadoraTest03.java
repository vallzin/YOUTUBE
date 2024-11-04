package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        double resultado1 = calculadora.dividirDoisNumeros1(20, 2);
        System.out.println(resultado1);
        System.out.println(calculadora.dividirDoisNumeros1(20, 2));

        Calculadora calculadora1 = new Calculadora();
        double resultado2 = calculadora1.dividirDoisNumeros2(20, 2);
        System.out.println(resultado2);

        Calculadora calculadora2 = new Calculadora();
        double resultado3 = calculadora2.dividirDoisNumeros2(20,0);
        System.out.println(resultado3);

        Calculadora calculadora3 = new Calculadora();
        double resultado4 = calculadora3.dividirDoisNumeros3(20,0);
        System.out.println(resultado4);

        Calculadora calculadora4 = new Calculadora();
        double resultado5 = calculadora4.dividirDoisNumeros4(20,0);
        System.out.println(resultado5);

        Calculadora calculadora5 = new Calculadora();
        double resultado6 = calculadora5.dividirDoisNumeros5(20,2);
        System.out.println(resultado6);

        System.out.println("-------------------------");
        Calculadora calculadora6 = new Calculadora();
//        double resultado7 = calculadora6.imprimirDivisaoDoisNumeros(80,0);//erro de compilação
        calculadora6.imprimirDivisaoDoisNumeros(40,4);


    }

}
