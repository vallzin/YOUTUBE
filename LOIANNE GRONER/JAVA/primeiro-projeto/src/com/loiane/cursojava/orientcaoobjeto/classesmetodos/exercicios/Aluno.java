package com.loiane.cursojava.orientcaoobjeto.classesmetodos.exercicios;

import javax.xml.transform.Source;

public class Aluno {

    String aluno;
    int matricula;
    String curso;
    String[] disciplinas = new String[3];
    double[][] notasDisciplinas = new double[3][4];

    void mostrarInfoAluno(){
        System.out.print("Nome: "+ aluno);
        System.out.print("\nMatricula: "+ matricula);
        System.out.print("\nCurso: "+ curso+"\n");

        for (int i = 0; i < notasDisciplinas.length; i++){
            System.out.println("Notas da disciplina "+ disciplinas[i]+":");
            for (int j = 0; j < notasDisciplinas[i].length; j++){
                System.out.print(notasDisciplinas[i][j] + " ");
            }
            System.out.println();
        }
    }

    boolean verificarAprovado(int indice){
        double soma = 0;
        for (int i = 0; i < notasDisciplinas[indice].length; i++){
            soma += notasDisciplinas[indice][i];
        }

        double media = soma / 4;

        if (media >= 7){
            return true;
        }
        return false;
    }
}
