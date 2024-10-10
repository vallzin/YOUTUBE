package com.loiane.cursojava.repeticao.exercicios;


import java.util.Scanner;

public class Aula17Exercicio27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Media alunos por turma");
        System.out.println("Digite a quantidade de turmas ");
        int qtdTurma = sc.nextInt();

        int qtdAluno;
        int soma = 0;
        boolean invalido = true;

        for (int i = 1; i <= qtdTurma; i++){
            invalido = true;
            do {
                System.out.print("Digite quantidade alunos turma ");
                qtdAluno = sc.nextInt();
                if (qtdAluno <= 40) {
                    invalido = false;
                }else {
                    System.out.println("Alunos por sala 40");
                }
            }while (invalido);
            soma += qtdAluno;

        }
        double mediaAluno = (double) soma / qtdTurma;
        System.out.println("A média de alunos por turma é " + mediaAluno);



    }
}

