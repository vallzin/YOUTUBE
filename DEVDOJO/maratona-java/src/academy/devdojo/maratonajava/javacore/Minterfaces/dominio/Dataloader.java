package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface Dataloader {
    public abstract void load();// public e padrão são padrões nno java
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }

}
