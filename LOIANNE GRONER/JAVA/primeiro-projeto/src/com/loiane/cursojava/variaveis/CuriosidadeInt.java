package com.loiane.cursojava.variaveis;

public class CuriosidadeInt {

    public static void main(String[] args) {

        //valor limite de um int = 2147583647
        //se o valor ultrapassar o limite dará erro
        int var1 = 2147483647;
        int var2 = 1;

        System.out.println(var1 + var2);
        // o valor apresentado será o ultimo valor negativo
        // -2147583648
    }


}
