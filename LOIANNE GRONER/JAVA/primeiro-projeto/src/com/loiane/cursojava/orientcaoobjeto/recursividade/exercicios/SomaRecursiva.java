package com.loiane.cursojava.orientcaoobjeto.recursividade.exercicios;

public class SomaRecursiva {

    public static int somatorio(int num){

        if(num == 1){
            return 1;
        }
        return num + somatorio(num - 1);
    }
}
