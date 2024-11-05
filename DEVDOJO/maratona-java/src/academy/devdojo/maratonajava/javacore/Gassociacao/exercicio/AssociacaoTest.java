package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio;

public class AssociacaoTest {

    public static void main(String[] args) {

        Local local = new Local("Rua das Rosas");
        Aluno aluno = new Aluno("Régis", 21);
        Professor professor = new Professor("Antônio", "Linguagem Java");

        Aluno[] alunosSeminario = {};

        Seminario seminario = new Seminario("Back end", alunosSeminario, local);

        Seminario[] seminariosDiponiveis = {seminario};

        professor.setSeminarios(seminariosDiponiveis);

        professor.imprimir();

    }

}
