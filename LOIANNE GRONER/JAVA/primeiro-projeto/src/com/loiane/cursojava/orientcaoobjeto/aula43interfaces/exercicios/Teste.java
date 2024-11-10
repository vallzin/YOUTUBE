package com.loiane.cursojava.orientcaoobjeto.aula43interfaces.exercicios;

public class Teste {

    public static void main(String[] args) {

        Quadrado q1 = new Quadrado();
        q1.setLado(2);
        q1.setNome("Quadrado");

        Circulo c1 = new Circulo();
        c1.setRaio(2);
        c1.setNome("Círculo");

        Triangulo t1 = new Triangulo();
        t1.setAltura(2);
        t1.setBase(3);
        t1.setNome("Triângulo");

        Cubo cb1 = new Cubo();
        cb1.setLado(3);
        cb1.setNome("Cubo");

        Cilindro cl = new Cilindro();
        cl.setAltura(3);
        cl.setRaio(2);
        cl.setNome("Cilindro");

        Piramide p = new Piramide();
        p.setAltura(3);
        p.setApotema(4);
        p.setArestaBase(2);
        p.setNumPoliBase(4);
        p.setBase(q1);
        p.setNome("Pirâmide");

        FiguraGeometrica[] figuras = new FiguraGeometrica[6];
        figuras[0] = q1;
        figuras[1] = c1;
        figuras[2] = t1;
        figuras[3] = cb1;
        figuras[4] = cl;
        figuras[5] = p;

        for (FiguraGeometrica fg : figuras){
            System.out.println("-*- ----------- -*-");
            System.out.println(fg.getNome());

            if(fg instanceof Figura2D){
                Figura2D f2d = (Figura2D) fg;
                System.out.println(f2d.calcularArea());
            }

            if(fg instanceof Figura3D){
                Figura3D f3d = (Figura3D) fg;
                System.out.println(f3d.calcularArea());
                System.out.println(f3d.calcularVolume());
            }

        }


    }

}
