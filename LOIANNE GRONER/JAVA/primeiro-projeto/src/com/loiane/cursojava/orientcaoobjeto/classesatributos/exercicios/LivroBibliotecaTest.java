package com.loiane.cursojava.orientcaoobjeto.classesatributos.exercicios;

import java.util.Date;

public class LivroBibliotecaTest {
    public static void main(String[] args) {

        LivroBiblioteca livro = new LivroBiblioteca();
        livro.nome = "Aplicando Java no dia-a-dia";
        livro.autor = "valmilson";
        livro.qtdPaginas= 5000;
        livro.anoLancamento = 2025;
        livro.isbn = "ISBN 987 - 654 - 321 - 0";

        livro.alugado = true;
        livro.emprestadoA = "Maria";
        livro.dataEntrega = new Date();

        System.out.println();
        System.out.println("Título: "+livro.nome);
        System.out.println("ISBN: "+livro.isbn);
        System.out.println("Autor: "+livro.autor);
        System.out.println("livro empretado para: "+ livro.emprestadoA);
        System.out.println("Data: "+livro.dataEntrega);




    }



}
