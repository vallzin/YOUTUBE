package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somarDoisNumeros(){
        System.out.println(10+10);
    }

    public void subtrairDoisNumeros(){
        System.out.println(21-2);
    }

    //dentro dos parêntesis estão os parâmentros (numParaMultiplicar e num2), ambos inteiros
    public void multiplicarDoisNumeros(int numParaMultiplicar, int num2){
        System.out.println(numParaMultiplicar * num2);
    }

    public double dividirDoisNumeros1(double num1, double num2){
        return 0;
    }
    public double dividirDoisNumeros2(double num1, double num2){
        return num1/num2;
    }
    public double dividirDoisNumeros3(double num1, double num2){
        if(num2 == 0){
            return 0;
        }
        return num1 / num2;
    }
    public double dividirDoisNumeros4(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        } else{
            return num1 / num2;
        }
    }

    public double dividirDoisNumeros5(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else{
            return 0;
        }
    }

    public void imprimirDivisaoDoisNumeros(double num1, double num2){
        //não tem retorno por ser "void"
        if (num2 == 0) {
            System.out.println("Não existe divisão por zero");
            //alternativa para não usar o else
            return;
        }
            System.out.println(num1 / num2);

    }

    public void alterarDoiNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alterarDoisNumeros");
        System.out.println("Num1: "+num1);
        System.out.println("Num2: "+num2);
    }


    public void somarArray(int[] numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    //varargs é uma sintaxe mais simples
    //varargs é uma simplificação de array
    //int... varargs tem sempre que serem o ultimo parâmetro
    public void somarVarArgs(int... numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }


}
