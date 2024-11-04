package academy.devdojo.maratonajava.javacore.Fmodificadoresestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadoresestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedez", 275);
        Carro c3 = new Carro("Audi", 290);

        System.out.println(Carro.velocidadeLim);
        Carro.velocidadeLim = 180;
        System.out.println(Carro.velocidadeLim);

        c1.imprimirCarro();
        c2.imprimirCarro();
        c3.imprimirCarro();
    }

}
