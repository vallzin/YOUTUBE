package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public class Cliente {

    private String cliente;
    private TipoCliente tipoCliente;

    public Cliente(String cliente, TipoCliente tipoCliente) {
        this.cliente = cliente;
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cliente='" + cliente + '\'' +
                ", tipoCliente=" + tipoCliente +
                '}';
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
