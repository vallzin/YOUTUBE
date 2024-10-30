package com.loiane.cursojava.orientcaoobjeto.classesmetodos.classesatributos.exercicios;

public class LivroDeLivrariaTest {
    public static void main(String[] args) {

        LivroDeLivraria livro = new LivroDeLivraria();
        livro.nome = "Aplicando Java no dia-a-dia";
        livro.autor = "valmilson";
        livro.qtdPaginas= 5000;
        livro.anoLancamento = 2025;
        livro.isbn = "ISBN 987 - 654 - 321 - 0";
        livro.preco = 63.89;

        System.out.println();
        System.out.println("Título: "+livro.nome);
        System.out.println("ISBN: "+livro.isbn);
        System.out.println("Autor: "+livro.autor);
        System.out.println("Quantidades de páginas: "+livro.qtdPaginas);
        System.out.println("Preço do livro: R$"+livro.preco);

    }
}

