package com.loiane.cursojava.arraymultidimensional.exercicios;

import java.util.Scanner;

public class Aula20Exercicio05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String [][][] compromissos = new String[12][31][24];

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

                boolean mesValido = false;
                int mes = 0;
//
                while (!mesValido) {
                    System.out.println("Mês do Ano: ");
                    mes = sc.nextInt();
                    if (mes > 0 && mes <= 12){
                        mesValido = true;
                    }else {
                        System.out.println("Mês inválido, tente novamente");
                    }
                }

                boolean diaValido = false;
                int dia = 0;

                    while (!diaValido) {
                        System.out.println("Dia do Ano: ");
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
                    if (hora > 7 && hora <= 12 || hora > 14 && hora <= 18){
                        horaValida = true;
                    }else {
                        System.out.println("Hora inválida, tente novamente");
                    }
                }

//                dia--;
                System.out.println("Digite o compromisso: ");
                compromissos[--mes][--dia][hora] = sc.next();

            } else if (opcao == 2) {

                boolean mesValido = false;
                int mes = 0;
//
                while (!mesValido) {
                    System.out.println("Mês do Ano: ");
                    mes = sc.nextInt();
                    if (mes > 0 && mes <= 12){
                        mesValido = true;
                    }else {
                        System.out.println("Mês inválido, tente novamente");
                    }
                }

                boolean diaValido = false;
                int dia = 0;

                while (!diaValido) {
                    System.out.println("Dia do Ano: ");
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
                    if (hora > 7 && hora <= 12 || hora > 14 && hora <= 18){
                        horaValida = true;
                    }else {
                        System.out.println("Hora inválida, tente novamente");
                    }
                }

//                dia--;
                System.out.println("Compromisso Agendado:");
                System.out.println(compromissos[--mes][--dia][hora]);

            }
        }

    }
}
