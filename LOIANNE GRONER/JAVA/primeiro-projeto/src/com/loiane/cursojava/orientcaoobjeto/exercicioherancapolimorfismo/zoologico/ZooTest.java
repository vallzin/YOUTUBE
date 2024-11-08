package com.loiane.cursojava.orientcaoobjeto.exercicioherancapolimorfismo.zoologico;

public class ZooTest {

    public static void main(String[] args) {

        Animal camelo = new Animal();

        camelo.setAniNome("Camêlo");
        camelo.setAniComp(150);
        camelo.setAniCor("Mustarda");
        camelo.setAniAmbi("Terra");
        camelo.setAniVelo(2.0);

        Peixe tubarao = new Peixe();

        tubarao.setAniNome("Tubarão");
        tubarao.setAniComp(300);
        tubarao.setAniPatas(0);
        tubarao.setAniCor("Cinzento");
        tubarao.setAniVelo(1.5);
        tubarao.setCaractPeixe("Barbatana e calda");

        Mamifero urso = new Mamifero();

        urso.setAniNome("Urso-do-canadá");
        urso.setAniComp(180);
        urso.setAniCor("Vermelho");
        urso.setAniAmbi("Terra");
        urso.setAniVelo(0.5);
        urso.setAlimMamif("Mel");

//        System.out.println("Zoo:");
//        System.out.println(camelo.toString());
//        System.out.println(tubarao.toString());
//        System.out.println(urso.toString());

        Animal[] animais = new Animal[3];
        animais[0] = camelo;
        animais[1] = tubarao;
        animais[2] = urso;

        System.out.println("Zoo:");
        for (Animal a : animais){
            System.out.println(a.toString());
        }

    }


}
