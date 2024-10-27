package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.exercicios;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();


        carro01.nome = "Fusca";
        carro01.modelo = "Popular";
        carro01.ano = 1997;
        System.out.println("Carro 1:");
        System.out.println("Nome:"+carro01.nome);
        System.out.println("Modelo: "+carro01.modelo);
        System.out.println("Ano: "+carro01.ano);
        System.out.println("*--------------------------");
        carro02.nome = "Ferrari";
        carro02.modelo = "Caramelo";
        carro02.ano = 2024;
        System.out.println("Carro 2:");
        System.out.println("Nome: "+carro02.nome);
        System.out.println("Modelo: "+carro02.modelo);
        System.out.println("Ano: "+carro02.ano);
    }
}
