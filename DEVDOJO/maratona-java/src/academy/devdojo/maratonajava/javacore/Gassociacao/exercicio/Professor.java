package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio;

public class Professor {

    private String professorNome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String professorNome) {
        this.professorNome = professorNome;

    }

    public Professor(String professorNome, String especialidade) {
        this.professorNome = professorNome;
        this.especialidade = especialidade;
    }

    public Professor(String professorNome, String especialidade, Seminario[] seminarios) {
        this.professorNome = professorNome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprimir(){
        System.out.println("*** ----------- ***");
        System.out.println("Professor: "+this.professorNome);
        if (this.seminarios == null) return;
        System.out.println("-*- Seminários cadastrados -*-");
        for (Seminario semi : this.seminarios){
            System.out.println(semi.getTitulo());
            System.out.println(semi.getLocal().getEndereco());
            if (semi.getAlunos() == null || semi.getAlunos().length == 0) continue;
            System.out.println("-*- Alunos -*-");
            for (Aluno a : semi.getAlunos())
                System.out.println("Aluno: "+ a.getAlunoNome()+" idade: "+ a.getAlunoIdade());
        }

    }


    public String getProfessorNome() {
        return professorNome;
    }

    public void setProfessorNome(String professorNome) {
        this.professorNome = professorNome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
