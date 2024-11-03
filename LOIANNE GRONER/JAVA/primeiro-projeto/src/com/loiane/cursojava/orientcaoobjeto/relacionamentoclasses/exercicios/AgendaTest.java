package com.loiane.cursojava.orientcaoobjeto.relacionamentoclasses.exercicios;

import java.util.Scanner;

public class AgendaTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o nome da Agenda: ");
        String nome = sc.nextLine();

        Agenda agenda = new Agenda(nome);
        /*
        outras formas
        Agenda agenda = new Agenda();
        agenda.setNome(nome);

         */

        Contato[] contatos = new Contato[3];
        for (int i = 0; i < contatos.length; i++){
            System.out.println("Entre com as informações do "+(i + 1)+"º contato: ");
            Contato c = new Contato();

            System.out.print("Digite o nome: ");
            nome = sc.nextLine();
            c.setNome(nome);

            System.out.print("Digite o telefone: ");
            String telefone = sc.nextLine();
            c.setTelefone(telefone);

            System.out.print("Digite o email: ");
            String email = sc.nextLine();
            c.setEmail(email);

            contatos[i] = c;
        }

        agenda.setContatos(contatos);

        if(agenda != null) {
            System.out.println(agenda.obterInfo());
        }

    }

}
