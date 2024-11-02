package com.loiane.cursojava.orientcaoobjeto.variaveisemetodosestaticos;

public class MinhaCalculadoraTest {

    public static void main(String[] args) {

//        MinhaCalculadora calc = new MinhaCalculadora();

        int soma1 = MinhaCalculadora.soma(1,3);
        System.out.println(soma1);
//        System.out.println(calc.soma(2,5));
        int soma2 = MinhaCalculadora.soma(1,3,4);
        System.out.println(soma2);
//        System.out.println(calc.soma(2,5,8));
        double soma3 = MinhaCalculadora.soma(1.5, 5.5);
        System.out.println(soma3);
//        System.out.println(calc.soma(2.5,5.4));




    }
}
