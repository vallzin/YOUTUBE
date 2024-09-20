package academy.devdojo.maratonajava.tiposprimitivos;

public class ExercicioTipoPrimitivos {

    public static void main(String[] args) {
        String nome = "Kuririn";
        String endereco = "Rua 1";
        double salario = 5463.21;
        String dataRecebimentoSalario = "20/12/2024";
        String mensagem = " EU "+nome+" morando no endereço "
                +endereco
                +" confirmo que recebi o salário de R$ "
                +salario+", na data "
                +dataRecebimentoSalario+" .";

        System.out.println(mensagem);

    }
}
