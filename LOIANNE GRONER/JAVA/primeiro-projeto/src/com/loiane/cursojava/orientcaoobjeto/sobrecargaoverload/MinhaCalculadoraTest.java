package com.loiane.cursojava.orientcaoobjeto.sobrecargaoverload;

public class MinhaCalculadoraTest {

    public static void main(String[] args) {

        MinhaCalculadora calc = new MinhaCalculadora();

        System.out.println(calc.soma(2,5));
        System.out.println(calc.soma(2,5,8));
        System.out.println(calc.soma(2.5,5.4));




    }
}
