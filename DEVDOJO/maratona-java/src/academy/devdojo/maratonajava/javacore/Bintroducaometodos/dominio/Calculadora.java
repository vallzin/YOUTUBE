package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(10+10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(21-2);
    }

    //dentro dos parêntesis estão os parâmentros (numParaMultiplicar e num2), ambos inteiros
    public void multiplicaDoisNumeros(int numParaMultiplicar, int num2){
        System.out.println(numParaMultiplicar * num2);
    }

    public double divideDoisNumeros(double num1, double num2){
        return 0;
    }
    public double divideDoisNumeros2(double num1, double num2){
        return num1/num2;
    }
    public double divideDoisNumeros3(double num1, double num2){
        if(num2 == 0){
            return 0;
        }
        return num1/num2;
    }

}
