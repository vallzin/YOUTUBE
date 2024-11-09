package com.loiane.cursojava.orientcaoobjeto.comparacaoherancainterface;

public interface SqlDML {

    void select(String query);
    void inert(String query);
    void delete(String query);
    void update(String query);

}
