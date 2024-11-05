package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Escola {

    private String nomeEscola;
    private Professor[] professores;

    public Escola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public Escola(String nomeEscola, Professor[] professores) {
        this.nomeEscola = nomeEscola;
        this.professores = professores;
    }

    public void imprimirDaEscola(){
        System.out.println(this.nomeEscola);
        if (professores == null) return;
        for (Professor prof : professores){
            System.out.println(prof.getNomeProfessor());
        }
    }



    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
