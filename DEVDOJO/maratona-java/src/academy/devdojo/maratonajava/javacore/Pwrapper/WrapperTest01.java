package academy.devdojo.maratonajava.javacore.Pwrapper;

public class WrapperTest01 {
    public static void main(String[] args) {

        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10l;
        float floatP = 10f;
        double doubleP = 10;
        char charP = 'w';
        boolean booleanP = true;

        Byte byteW = 127;
        Short shortW = 1;
        Integer intW = 1; // autoboxing
        Long longW = 10l;
        Float floatW = 10f;
        Double doubleW = 10d;
        Character charW = 'w';
        Boolean booleanW = true;

        int i = intW; // unboxinb
        Integer intW2 = Integer.parseInt("1");

    }
}
