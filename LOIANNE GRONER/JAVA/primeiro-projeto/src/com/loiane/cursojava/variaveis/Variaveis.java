package com.loiane.cursojava.variaveis;

public class Variaveis {
    public static void main(String[] args) {

        //convenção java
        int idade = 29;
        String nome = "val";
        String nomeDoMeuCachorro = "chico";

        //pouco utilizada
        int _idade;
        int $idade;
        String ano2024 = "2024";

        //não é convenção java
        String nome_do_meu_cachorro;// não é convenção java
        String NomeDoMeuCachorro;// não é convenção java

        //má prática
        int a = 1;
        String b = "maria";

        idade = 20;
        System.out.println("idade "+ idade);

    }
}
