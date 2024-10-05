package academy.devdojo.maratonajava.repeticao;

public class EstruturaRepeticao01 {
    //while; do while e for
    public static void main(String[] args) {

        int count = 0;
        while (count < 10){
            System.out.print(" "+count);
            count++;
        }

        System.out.println();
        int count1 = 0;
        while (count1 < 10){
            System.out.print(" "+ ++count1);
        }

        System.out.println();
        int count2 = 0;
        do {
            System.out.print(" "+ count2++);
        }while (count2 < 10);

        System.out.println();
        int count3 = 10;
        for (int i = 0; i < count3; i++){
            System.out.print(" " + i);
        }

        System.out.println();
        int count4 = 10;
        for (int i = 0; i < count4;){
            System.out.print(" " + ++i);
        }
    }
}
