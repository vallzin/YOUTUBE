package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioMemoria;

public class RepositorioTest {
    public static void main(String[] args) {
//        RepositorioBancoDeDados repositorioBancoDeDados = new RepositorioBancoDeDados();
//        Repositorio repositorio = new RepositorioBancoDeDados();
//        Repositorio repositorio = new RepositorioArquivo();
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();

    }
}
