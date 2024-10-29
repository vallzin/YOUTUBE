package com.loiane.cursojava.orientcaoobjeto.classesatributos.exercicios;

public class LivroTest {
    public static void main(String[] args) {

        Livro livro = new Livro();
         livro.nome = "Aplicando Java no dia-a-dia";
         livro.autor = "valmilson";
         livro.qtdPaginas= 5000;
         livro.anoLancamento = 2025;
         livro.isbn = "ISBN 987 - 654 - 321 - 0";

        System.out.println();
        System.out.println("Título: "+livro.nome);
        System.out.println("ISBN: "+livro.isbn);
        System.out.println("Autor: "+livro.autor);
        System.out.println("Quantidades de páginas: "+livro.qtdPaginas);
    }
}
