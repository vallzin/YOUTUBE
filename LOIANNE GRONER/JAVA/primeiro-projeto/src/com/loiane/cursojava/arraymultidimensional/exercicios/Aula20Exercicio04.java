package com.loiane.cursojava.arraymultidimensional.exercicios;

import java.util.Scanner;

public class Aula20Exercicio04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String [][] compromissos = new String[31][24];

        boolean sair = false;
        byte opcao;
        while (!sair){
            System.out.println("Digite 0 - Sair da Agenda");
            System.out.println("Digite 1 - Adicionar Compromisso");
            System.out.println("Digite 2 - Verificar Compromisso");

            opcao = sc.nextByte();

            if(opcao == 0){
                System.out.println("Saindo da Agenda");
                sair = true;
                break;
            } else if (opcao ==1) {
                boolean diaValido = false;
                int dia = 0;
                while (!diaValido) {
                    System.out.println("Dia do mês: ");
                    dia = sc.nextInt();
                    if (dia > 0 && dia <= 31){
                        diaValido = true;
                    }else {
                        System.out.println("Dia inválido, tente novamente");
                    }
                }

                boolean horaValida = false;
                int hora = 0;
                while (!horaValida) {
                    System.out.println("Hora do compromisso: ");
                    hora = sc.nextInt();
                    if (hora > 0 && hora <= 24){
                        horaValida = true;
                    }else {
                        System.out.println("Hora inválida, tente novamente");
                    }
                }

//                dia--;
                System.out.println("Digite o compromisso");
                compromissos[--dia][hora] = sc.next();

            } else if (opcao == 2) {

                boolean diaValido = false;
                int dia = 0;
                while (!diaValido) {
                    System.out.println("Dia do mês: ");
                    dia = sc.nextInt();
                    if (dia > 0 && dia <= 31){
                        diaValido = true;
                    }else {
                        System.out.println("Dia inválido, tente novamente");
                    }
                }

                boolean horaValida = false;
                int hora = 0;
                while (!horaValida) {
                    System.out.println("Hora do compromisso: ");
                    hora = sc.nextInt();
                    if (hora > 0 && hora <= 24){
                        horaValida = true;
                    }else {
                        System.out.println("Hora inválida, tente novamente");
                    }
                }

//                dia--;
                System.out.println("Compromisso Agendado:");
                System.out.println(compromissos[--dia][hora]);

            }
        }

    }
}
