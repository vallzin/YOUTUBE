package academy.devdojo.maratonajava.estruturascondicionais;

public class EstruturaCondicionaSwitch {
    public static void main(String[] args) {
        //imprima o dia da asemana considerando 1 como domingo

        byte dia = 6;
        //() -> char, int, byte, short, enum e String
        switch(dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segundo");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
