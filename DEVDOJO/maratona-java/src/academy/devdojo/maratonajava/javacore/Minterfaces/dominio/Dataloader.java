package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface Dataloader {

    //Todos os atributos em uma interface são CONTANTES
    public static final int MAX_DATA_SIZE = 10;
    public abstract void load();// public e padrão são padrões nno java
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }

    public static void  retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize da interface");
    }

}
