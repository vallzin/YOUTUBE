package academy.devdojo.maratonajava.tiposprimitivos;

public class Aula02TiposPrimitivos {

    public static void main(String[] args) {
        //int, double, float, char, short, long, boolean
        //Data type -> Size ------------> Range of values that can be stored -----------------------> Default value
        //int -------> 4 bytes/bits-----> 128 to 127 -----------------------------------------------> 0
        int idade = 10;
        //long ------> 8 bytes/64 bits--> -32768 to 32767 ------------------------------------------> 0
        long numeroGrando = 10000000L;
        //double ----> 8 bytes/64 bits--> -2,147,483,648 -------------------------------------------> 0
        double salarioDouble = 2000.0;
        //float -----> 4 bytes/bits-----> -9,223,372,036,854,775,808 to 9,223,372,036,854,750,000 --> 0
        float salarioFloat = 2500.0F;
        //byte ------> 1 byte/bits ----------> 3.4e-038 to 3.4e+038 --------------------------------> 0.0f
        byte idadeByte = 10;
        //short -----> 2 byte/bits ---------> 1.7e-308 to 1.7e+038 ---------------------------------> 0.0d
        short idadeShort = 10;
        //boolean ---> 1 bit --------------> true or false -----------------------------------------> true
        boolean verdadeiro = true;
        //boolean ---> 1 bit -------------> true or false -------------------------------------------> true
        boolean falso = false;
        //char ------> 2 bytes = 16 bits ------------------------------------------------------------> \u0000
        char caractere = 'M';

        int cast = (int) 10000000000L;// forçando um valor com casting

        System.out.println("A idade é "+idade+" anos");
        System.out.println(verdadeiro);
        System.out.println("Casting de um long para inteiro: "+cast);


    }
}
