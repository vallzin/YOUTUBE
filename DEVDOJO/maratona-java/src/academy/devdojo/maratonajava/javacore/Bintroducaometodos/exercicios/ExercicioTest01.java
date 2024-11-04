package academy.devdojo.maratonajava.javacore.Bintroducaometodos.exercicios;

public class ExercicioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Carlos";
        funcionario.idade = 25;
        funcionario.salarios = new double[]{1200, 900, 987.32};

        System.out.println();
        funcionario.imprimir2();
//        funcionario.ImprimirMediaSalario();

    }
}
