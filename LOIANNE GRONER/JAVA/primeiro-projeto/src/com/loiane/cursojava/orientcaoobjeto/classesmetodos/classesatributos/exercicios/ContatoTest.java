package com.loiane.cursojava.orientcaoobjeto.classesmetodos.classesatributos.exercicios;

public class ContatoTest {

//    String nome;
//    String email;
//    String endereco;
//    String[] telefones;


    public static void main(String[] args) {

        Contato contato1 = new Contato();

        contato1.nome = "JôJô";
        contato1.email = "jojo@mail.com";
        contato1.endereco = "Avenida J";

        contato1.telefones = new String[5];
        contato1.telefones[0] = "321-654-987";

        System.out.println("Nome: "+contato1.nome);
        System.out.println("Email: "+contato1.email);
        System.out.println("Endereço: "+contato1.endereco);
        System.out.println("Telefones: "+contato1.telefones[0]);


    }

}
