package com.loiane.cursojava.orientcaoobjeto.relacionamentoclasses.exercicios;

import java.util.Scanner;

public class CursoTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do curso: ");
        String nomeCurso = sc.nextLine();

        System.out.print("Digite o horário do curso: ");
        String horaCurso = sc.nextLine();

        System.out.print("Digite o nome do professor: ");
        String nomeProf = sc.nextLine();

        System.out.print("Digite o nome do departamento: ");
        String departProf = sc.nextLine();

        System.out.print("Digite o email do professor: ");
        String emailProf = sc.nextLine();

        Curso curso = new Curso();

        curso.setNome(nomeCurso);
        curso.setHorario(horaCurso);

        Professor prof = new Professor();

        prof.setNome(nomeProf);
        prof.setDepartamento(departProf);
        prof.setEmail(emailProf);

        curso.setProfessor(prof);

        System.out.println("*** ----- Alunos ------ ***");

        Aluno[] alunos = new Aluno[5];
        for (int i = 0; i < alunos.length; i++){

            System.out.print("Digite o nome do "+ (i + 1)+"º aluno: ");
            String  nomeAluno = sc.next();

            System.out.print("Digite a matrícula do aluno: ");
            String matrAluno = sc.next();

            double[] notas = new double[4];
            for (int j = 0; j < notas.length; j++){
                System.out.print("Digite a "+(j + 1)+"ª nota: ");
                notas[j] = sc.nextDouble();
            }

            Aluno aluno = new Aluno();

            aluno.setNome(nomeAluno);
            aluno.setMatricula(matrAluno);
            aluno.setNotas(notas);

            alunos[i] = aluno;

        }

        curso.setAlunos(alunos);

        System.out.println(curso.obterInfo());


    }
}
