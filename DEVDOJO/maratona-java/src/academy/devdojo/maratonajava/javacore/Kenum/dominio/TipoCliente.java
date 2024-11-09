package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURICIDA(2,"Pessoa Jurídica");

    public final int VALOR;
    public String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatório) {
        this.VALOR = valor;
        this.nomeRelatorio = nomeRelatório;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
