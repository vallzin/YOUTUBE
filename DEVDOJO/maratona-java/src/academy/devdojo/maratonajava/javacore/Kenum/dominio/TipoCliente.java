package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURICIDA(2,"Pessoa Jurídica");

    public final int VALOR;
    public final String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatório) {
        this.VALOR = valor;
        this.nomeRelatorio = nomeRelatório;
    }

    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio){
        for (TipoCliente tipoCliente : values()){
            if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)){
                return tipoCliente;
            }

        }

        return null;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
