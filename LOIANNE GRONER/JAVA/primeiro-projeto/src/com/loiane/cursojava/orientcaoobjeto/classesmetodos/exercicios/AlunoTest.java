package com.loiane.cursojava.orientcaoobjeto.classesmetodos.exercicios;

import java.util.Scanner;
import java.util.Locale;

public class AlunoTest {
    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "US"));
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.print("Digite o nome do aluno: ");
        aluno.aluno = sc.next();

        System.out.print("Digite o curso: ");
        aluno.curso = sc.next();

        System.out.print("Digite a matricula: ");
        aluno.matricula = sc.nextInt();
        sc.nextLine();


//        aluno.disciplinas = new String[3];
        for (int i = 0; i < aluno.disciplinas.length; i++){
            System.out.print("Digite o nome da disciplina: ");
            aluno.disciplinas[i] = sc.next();
        }

        for (int i = 0; i < aluno.notasDisciplinas.length; i++){
            System.out.println("Notas para a disciplina "+ aluno.disciplinas[i]);
            for (int j = 0; j < aluno.notasDisciplinas[i].length; j++){
                System.out.print("Digite a "+(j+1)+" ª nota:");
                aluno.notasDisciplinas[i][j] = sc.nextDouble();
            }
            sc.nextLine();
            System.out.println();
        }

        aluno.mostrarInfoAluno();

        for (int i = 0; i < aluno.disciplinas.length; i++){
            if (aluno.verificarAprovado(i)){
                System.out.println("Disciplina "+aluno.disciplinas[i] + " foi - Aprovado");
            }else {
                System.out.println("Disciplina"+aluno.disciplinas[i] + " foi - Reprovado");

            }
        }
    }
}
