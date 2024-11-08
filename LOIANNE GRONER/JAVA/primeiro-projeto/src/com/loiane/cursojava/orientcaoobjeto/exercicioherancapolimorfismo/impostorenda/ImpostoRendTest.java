package com.loiane.cursojava.orientcaoobjeto.exercicioherancapolimorfismo.impostorenda;

public class ImpostoRendTest {

    public static void main(String[] args) {

        PessoaFisica pF1 = new PessoaFisica();
        pF1.setContribNome("Carlos");
        pF1.setContriRenda(1000);
        pF1.setCpf("244.360.670-84");

        PessoaFisica pF2 = new PessoaFisica();
        pF2.setContribNome("José");
        pF2.setContriRenda(3000);
        pF1.setCpf("244.160.670-80");

        PessoaFisica pF3 = new PessoaFisica();
        pF3.setContribNome("Antonio");
        pF3.setContriRenda(7000);
        pF1.setCpf("244.900.670-74");

        PessoaJuridica pJ1 = new PessoaJuridica();
        pJ1.setContribNome("Cristina");
        pJ1.setContriRenda(50000);
        pJ1.setCnpj("94.672.615/0001-08");

        PessoaJuridica pJ2 = new PessoaJuridica();
        pJ2.setContribNome("Felipa");
        pJ2.setContriRenda(5500);
        pJ1.setCnpj("90.672.615/0001-05");

        PessoaJuridica pJ3 = new PessoaJuridica();
        pJ3.setContribNome("Carla");
        pJ3.setContriRenda(15000);
        pJ1.setCnpj("94.692.615/0001-10");

        Contribuinte[] contribuintes = new Contribuinte[6];
        contribuintes[0] = pF1;
        contribuintes[1] = pF2;
        contribuintes[2] = pF3;
        contribuintes[3] = pJ1;
        contribuintes[4] = pJ2;
        contribuintes[5] = pJ3;

        for (Contribuinte c : contribuintes){
            System.out.println(c.toString());
        }





    }

}
