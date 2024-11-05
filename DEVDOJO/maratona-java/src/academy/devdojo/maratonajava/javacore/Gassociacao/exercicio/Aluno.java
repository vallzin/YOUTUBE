package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio;

public class Aluno {

    private String alunoNome;
    private int alunoIdade;
    private Seminario seminario;

    public Aluno(String alunoNome, int alunoIdade) {
        this.alunoNome = alunoNome;
        this.alunoIdade = alunoIdade;
    }

    public String getAlunoNome() {
        return alunoNome;
    }

    public void setAlunoNome(String alunoNome) {
        this.alunoNome = alunoNome;
    }

    public int getAlunoIdade() {
        return alunoIdade;
    }

    public void setAlunoIdade(int alunoIdade) {
        this.alunoIdade = alunoIdade;
    }
}
