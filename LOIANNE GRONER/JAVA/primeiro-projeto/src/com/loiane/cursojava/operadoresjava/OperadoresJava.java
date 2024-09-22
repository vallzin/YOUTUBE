package com.loiane.cursojava.operadoresjava;

public class OperadoresJava {

    public static void main(String[] args) {

        int resultado = 1 + 2;
        System.out.println(resultado);

        resultado = resultado - 1;
        System.out.println(resultado);

        resultado = resultado * 2;
        System.out.println(resultado);

        resultado = resultado / 2;
        System.out.println(resultado);

        resultado = resultado + 8;
        System.out.println(resultado);

        resultado = resultado % 7;
        System.out.println(resultado);

        String primNome = "Esta é";
        String segNome = " uma string concatenada";
        System.out.println(primNome + segNome);

        resultado = resultado + 1;
        System.out.println(resultado);

        resultado++;
        System.out.println(resultado);

        System.out.println(resultado++);
        //similar a
//        System.out.println(resultado);
//        resultado = resultado + 1;
//        resultado += 1;

        System.out.println(++resultado);
        //similar a
//        resultado += 1;
//        System.out.println(resultado);

        resultado--;
        System.out.println(resultado);

        System.out.println(resultado--);
        System.out.println(--resultado);



    }
}
