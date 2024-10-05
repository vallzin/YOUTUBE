package academy.devdojo.maratonajava.estruturascondicionais;

public class EstruturaCondicionaisExercicioSwitch {
    public static void main(String[] args) {
        //Dados os valores de 1 a 7 e utilizando o Switch, imprima se é dia útil ou
        //final de semana, considerando 1 como domingo

        int dia = 1;
        switch (dia){
            case 1:
            case 7:
                System.out.println("Final de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

    }
}