package com.loiane.cursojava.orientcaoobjeto.classeobjeto;

public class AlunoTest {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        Aluno aluno2 = new Aluno();

        aluno.setCurso("Ciências da Computação");
        double[] notas = {10,9,8,7};
        aluno.setNotas(notas);

        System.out.println();
        System.out.println(aluno);

        String s1 = "asdfg";
        String s2 = "asdfg";

        System.out.println(s1.equals(s2));
        System.out.println();

        aluno2.setCurso("Ciências da Computação");
        double[] notas2 = {10,9,8,7};
        aluno2.setNotas(notas2);

        //Assim comparamos referância
        System.out.println("Comparando as referências");
        System.out.println(aluno == aluno2);
        System.out.println("Comparando os atributos, poré sem hascode");
        //forma correta de comparação(comparando os atributos sem hascode)
        System.out.println(aluno.equals(aluno2));
    }
}
