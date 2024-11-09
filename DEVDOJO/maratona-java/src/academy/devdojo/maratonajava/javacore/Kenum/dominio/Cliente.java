package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public class Cliente {

    private String cliente;
    private TipoCliente tipoCliente;
    TipoPagamento tipoPagamento;

    public enum TipoPagamento{
        DEBITO, CREDITO
    }

    public Cliente(String cliente, TipoCliente tipoCliente,
                   TipoPagamento tipoPagamento) {
        this.cliente = cliente;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cliente='" + cliente + '\'' +
                ", tipoCliente=" + tipoCliente.getNomeRelatorio() +
                ", tipoClienteInt=" + tipoCliente.VALOR +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
