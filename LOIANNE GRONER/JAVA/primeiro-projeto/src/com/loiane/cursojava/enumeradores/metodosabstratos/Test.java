package com.loiane.cursojava.enumeradores.metodosabstratos;

public class Test {
    public static void main(String[] args) {

//        for (TipoDocumento doc : TipoDocumento.values()){
//            System.out.println(doc + " - "+ doc.geraNumeroTest());
//        }
        Pessoa pessoaF = new Pessoa();
        pessoaF.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
        pessoaF.setNumeroDocumento(pessoaF.getTipoDocumento().geraNumeroTest());
        System.out.println(pessoaF);
        System.out.println("----------------------");
        Pessoa pessoaJ = new Pessoa();
        pessoaJ.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CNPJ"));
        pessoaJ.setNumeroDocumento(pessoaJ.getTipoDocumento().geraNumeroTest());
        System.out.println(pessoaJ);


    }
}
