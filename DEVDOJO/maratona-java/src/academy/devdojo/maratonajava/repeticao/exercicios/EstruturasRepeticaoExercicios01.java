package academy.devdojo.maratonajava.repeticao.exercicios;

public class EstruturasRepeticaoExercicios01 {
    public static void main(String[] args) {

        double valorTotal = 30000;
//        for (int parcela = 1; parcela <= valorTotal; parcela++){
//            double valorParcela = valorTotal / parcela;
//            if(valorParcela >= 1000){
//                System.out.println("Parcela "+parcela+" R$ "+valorParcela);
//            }
//            System.out.println("fora do if, mas dentro do for "+parcela);
//        }

//            for (int parcela = 1; parcela <= valorTotal; parcela++){
//                double valorParcela = valorTotal / parcela;
//                if(valorParcela >= 1000){
//                    System.out.println("Parcela "+parcela+" R$ "+valorParcela);
//                }else{
//                    break;
//                }
//
//            System.out.println("fora do if, mas dentro do for "+parcela);
//            }

        for (int parcela = 1; parcela <= valorTotal; parcela++){
            double valorParcela = valorTotal / parcela;
            if(valorParcela < 1000){
                break;
            }
            System.out.println("Parcela "+parcela+" R$ "+valorParcela);
        }
    }
}
