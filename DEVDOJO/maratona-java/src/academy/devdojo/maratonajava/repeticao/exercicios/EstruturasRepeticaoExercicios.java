package academy.devdojo.maratonajava.repeticao.exercicios;

public class EstruturasRepeticaoExercicios {
    public static void main(String[] args) {
        int pares = 0;
//        do {
//            if(pares %2 == 0){
//                System.out.println(pares);
//                pares = pares + 2;
//            }
//        }while (pares <= 1000000);

        // " i " tanto pode começar com zero ou com um
        for (int i = 0; i < 1000000; i++){
            if(i %2 == 0)
                System.out.println(i);
        }
    }
}
