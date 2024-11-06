package com.loiane.cursojava.orientcaoobjeto.heranca.test4;

public class HerancaTest4 {

    public static void main(String[] args) {

//        Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa prof = new Professor();

//        pessoa.setEndereco("Rua 1, n° 1");
        aluno.setEndereco("Rua 2, n°2");
        prof.setEndereco("Rua 3, n°3");

//        System.out.println(aluno.obterEtiquetaEndereco());
//        System.out.println(prof.obterEtiquetaEndereco());

        aluno.imprimirEtiquetaEndereco();
        prof.imprimirEtiquetaEndereco();


    }
}
