package academy.devdojo.maratonajava.estruturascondicionais;

public class EstruturasCondicionaisIf {
    public static void main(String[] args) {
        //if sem else
        int idade = 15;
        boolean eAutorizadoComparaBebida = idade >= 18;
        if(eAutorizadoComparaBebida){
            System.out.println("Autorizado a comprar bebida alcoólica");
        }

        if(!eAutorizadoComparaBebida){
            System.out.println("Não Autorizado para compra bebida alcoólica");
        }
        //if com else
        if(eAutorizadoComparaBebida){
            System.out.println("Autorizado a comprar bebida alcoólica");
        }else {
            System.out.println("Não autorizado a comprar bebida alcoólica");
        }

        System.out.println("Fora do If");
    }
}
