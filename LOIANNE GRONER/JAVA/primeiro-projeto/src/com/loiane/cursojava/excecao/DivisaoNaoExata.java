package com.loiane.cursojava.excecao;

public class DivisaoNaoExata extends Exception{
    private int num;
    private int den;

    public DivisaoNaoExata(int num, int den){
        this.num = num;
        this.den = den;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }

    @Override
    public String toString() {
        return "Resultado de " +
                 num + "/" +
                 den + " = " +
                " não é um inteiro.";
    }
}
