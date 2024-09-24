package academy.devdojo.maratonajava.estruturascondicionais;

public class EstruturaCondicionaisElseIf {
    /* idade < 15 categoria infantil
    *  idade >= 15 && idade < 18 categoria juvenil
    *  idade >= 18 categoria adulto
    * */
    public static void main(String[] args) {

        int idade = 20;
        String categoria;

        if (idade < 15){
            categoria = "categoria infantil";
        } else if (idade >=15 && idade < 18) {
            categoria = "categoria juvenil";
        }else {
            categoria ="categoria adulto";
        }
        System.out.println(categoria);

    }



}
