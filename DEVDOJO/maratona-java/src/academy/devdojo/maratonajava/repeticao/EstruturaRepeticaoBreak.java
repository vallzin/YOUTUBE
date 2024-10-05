package academy.devdojo.maratonajava.repeticao;

public class EstruturaRepeticaoBreak {
    //while; do while e for
    public static void main(String[] args) {

        int valorMax = 50;
//        for (int i = 0; i <= valorMax; i++) {
//            if (i <= 25){
//                System.out.println(i);
//            }
//            System.out.println("i = "+i);
//        }
        for (int i = 0; i <= valorMax; i++) {
            if (i > 25) break;
            System.out.println("i = "+i);
        }
    }
}
