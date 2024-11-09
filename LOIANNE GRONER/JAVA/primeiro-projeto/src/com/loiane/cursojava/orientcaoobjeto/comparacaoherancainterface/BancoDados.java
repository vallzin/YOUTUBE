package com.loiane.cursojava.orientcaoobjeto.comparacaoherancainterface;

public interface BancoDados  extends SqlDCL, SqlDML, SqlDDL{

    void abrirConexao();

    void fecharConexao();

}
