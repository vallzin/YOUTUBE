package com.loiane.cursojava.orientcaoobjeto.aula28a33.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class AlunoTest {
    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "US"));
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.print("Digite o nome do aluno: ");
        aluno.setAluno(sc.next());

        System.out.print("Digite o curso: ");
        aluno.setCurso(sc.next());

        System.out.print("Digite a matricula: ");
        aluno.setMatricula(sc.nextInt());
        sc.nextLine();


//        aluno.disciplinas = new String[3];
        for (int i = 0; i < aluno.getDisciplinas().length; i++){
            System.out.print("Digite o nome da disciplina: ");
            aluno.setNomeDisciplinaPos(i, sc.next());
        }

        for (int i = 0; i < aluno.getNotasDisciplinas().length; i++){
            System.out.println("Notas para a disciplina "+ aluno.getDisciplinas()[i]);
            for (int j = 0; j < aluno.getNotasDisciplinas()[i].length; j++){
                System.out.print("Digite a "+(j+1)+" ª nota:");
                aluno.setNotaPosIJ(i, j, sc.nextDouble());
            }
            sc.nextLine();
            System.out.println();
        }

        aluno.mostrarInfoAluno();

        for (int i = 0; i < aluno.getDisciplinas().length; i++){
            if (aluno.verificarAprovado(i)){
                System.out.println("Disciplina "+aluno.getDisciplinas()[i] + " foi - Aprovado");
            }else {
                System.out.println("Disciplina"+aluno.getDisciplinas()[i] + " foi - Reprovado");

            }
        }
    }
}
