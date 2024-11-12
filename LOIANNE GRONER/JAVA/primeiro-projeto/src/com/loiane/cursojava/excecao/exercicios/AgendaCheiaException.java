package com.loiane.cursojava.excecao.exercicios;

public class AgendaCheiaException extends Exception{

    @Override
    public String getMessage() {
        return "Agenda já está cheia";
    }
}
