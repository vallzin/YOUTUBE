package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class FileLoader implements Dataloader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carregando dadps de um arquivo");
    }

    @Override
    public void remover() {
        System.out.println("Deletando dados de um arquivo");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no arquivo");
    }
}
