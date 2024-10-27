package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        estudante.nome  = "valmilson";
        estudante.idade = 45;
        estudante.sexo  = 'm';

        System.out.println("Nome: "+ estudante.nome);
        System.out.println("Idade: " + estudante.idade);
        System.out.println("Sexo: "+estudante.sexo);
        System.out.println(estudante);
    }
}
