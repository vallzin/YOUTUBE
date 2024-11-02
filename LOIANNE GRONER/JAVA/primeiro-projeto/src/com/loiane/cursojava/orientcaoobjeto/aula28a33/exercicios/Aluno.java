package com.loiane.cursojava.orientcaoobjeto.aula28a33.exercicios;

public class Aluno {

    private String aluno;
    private int matricula;
    private String curso;
    private String[] disciplinas;
    private double[][] notasDisciplinas;

    public Aluno() {
        disciplinas = new String[3];
        notasDisciplinas = new double[3][4];
    }

    public Aluno(String aluno, int matricula, String curso) {
        this.aluno = aluno;
        this.matricula = matricula;
        this.curso = curso;
        this.disciplinas = new String[3];
        this.notasDisciplinas = new double[3][4];
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public double[][] getNotasDisciplinas() {
        return notasDisciplinas;
    }

    public void setNotasDisciplinas(double[][] notasDisciplinas) {
        this.notasDisciplinas = notasDisciplinas;
    }

    public void mostrarInfoAluno(){
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

    public boolean verificarAprovado(int indice){
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

    private double obterMedia(int indice){
        double soma = 0;
        for(int i = 0; i < notasDisciplinas.length; i++){
            soma += notasDisciplinas[indice][i];
        }
        double media = soma / 4;
        return media;
    }

    public void setNomeDisciplinaPos(int pos, String disciplina){
        this.disciplinas[pos] = disciplina;
    }

    public void setNotaPosIJ(int posI, int posJ, double nota){
        this.notasDisciplinas[posI][posJ]= nota;
    }
}
