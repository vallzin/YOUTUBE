package com.loiane.cursojava.orientcaoobjeto.exercicioaula28a33;

public class Lampada {
    private String modelo;
    private String tensao;
    private int potencia;
    private String cor;
    private String tipoLuz;
    private int garantia;
    private String[] tipos;
    private boolean tipoAbajur;
    private boolean ligada;

    public Lampada() {
    }

    public Lampada(String modelo, String tensao,
                   int potencia, String cor,
                   String tipoLuz, int garantia,
                   String[] tipos, boolean tipoAbajur,
                   boolean ligada) {
        this.modelo = modelo;
        this.tensao = tensao;
        this.potencia = potencia;
        this.cor = cor;
        this.tipoLuz = tipoLuz;
        this.garantia = garantia;
        this.tipos = tipos;
        this.tipoAbajur = tipoAbajur;
        this.ligada = ligada;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTensao() {
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoLuz() {
        return tipoLuz;
    }

    public void setTipoLuz(String tipoLuz) {
        this.tipoLuz = tipoLuz;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public String[] getTipos() {
        return tipos;
    }

    public void setTipos(String[] tipos) {
        this.tipos = tipos;
    }

    public boolean isTipoAbajur() {
        return tipoAbajur;
    }

    public void setTipoAbajur(boolean tipoAbajur) {
        this.tipoAbajur = tipoAbajur;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public void ligar(){
        setLigada(true);
    }

    public void desligar(){
        setLigada(false);
    }

    public void mostrarEstado(){
        if(isLigada()){
            System.out.println("Lâmpada está ligada");
        }else {
            System.out.println("Lâmpada está desligada");
        }
    }

    public void mudarEstado(){
        if (isLigada()){
            desligar();
        }else {
            ligar();
        }
    }


}
