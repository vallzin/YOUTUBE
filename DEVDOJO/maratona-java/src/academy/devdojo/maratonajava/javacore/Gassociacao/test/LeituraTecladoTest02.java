package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraTecladoTest02 {
    public static void main(String[] args) {
        System.out.println("Previsão do futuro");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma pergunta e eu responderei 'sim' ou 'não'");
        String pergunta = sc.nextLine();
        if(pergunta.charAt(0) == ' '){
            System.out.println("sim");
        }else {
            System.out.println("não");
        }
    }
}
