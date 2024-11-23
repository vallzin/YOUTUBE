package academy.devdojo.maratonajava.javacore.Qstring;

public class StringTest01 {

    public static void main(String[] args) {
        String name = "william";//string constant pool
        String name2 = "william";
        name = name.concat(" sergio");
        System.out.println(name);
        System.out.println(name.equals(name2));
        //1 - criando uma variável de referência;
        // 2 - objeto dot ipo string;
        // 3 - uma string no pool de string
        String name3 = new String("william");
        System.out.println(name2 == name3);
        System.out.println(name2 == name3.intern());

    }



}
