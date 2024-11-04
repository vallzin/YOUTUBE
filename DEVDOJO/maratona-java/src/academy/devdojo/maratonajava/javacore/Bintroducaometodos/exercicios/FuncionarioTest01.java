package academy.devdojo.maratonajava.javacore.Bintroducaometodos.exercicios;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Carlos");
        funcionario.setIdade(25);
        funcionario.setSalarios(new double[]{1200, 900, 987.32});
        funcionario.getMedia();

        System.out.println();
        funcionario.imprimir2();
//        funcionario.ImprimirMediaSalario();

    }
}
