package academy.devdojo.maratonajava.operadores;

public class Aula14Operadores {
    public static void main(String[] args) {
        //academy.devdojo.maratonajava.operadores aritméticos
        // + - / *
        int num1 = 10;
        int num2 = 20;
        int resultadoSoma = num2 + num1;
//      + -> operador sobrecarregado
        System.out.println(num1 + num2);
        System.out.println(num1 + " valor " + num2);
        System.out.println(resultadoSoma);

        int resultadoMulti = num1 * num2;
        System.out.println(resultadoMulti);

        double resultadoDiv = num2 / num1;
        System.out.println(resultadoDiv);
        double resultadoDiv1 = num1 / (double) num2;//utilizando casting
        System.out.println(resultadoDiv1);
        double num3 = 10;
        double num4 = 20;
        double resultadoDiv2 = num3 / num4;
        System.out.println(resultadoDiv2);

        // %
        int resto = 21 % 7;
        System.out.println(resto);
        double resto1 = 23 % 7;
        System.out.println(resto1);

        // < -> menor; > -> maior;
        // <= -> menor igual; >= -> maior igual;
        // == -> igual; != -> diferentes
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezMenorIgualVinte = 10 <= 20;
        boolean isDezMaiorIgualVinte = 10 >= 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteVinte = 10 != 20;
        System.out.println("isDezMaiorQueVinte --> "+ isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte --> "+ isDezMenorQueVinte);
        System.out.println("isDezMenorIgualVinte --> "+ isDezMenorIgualVinte);
        System.out.println("isDezMaiorIgualVinte --> "+ isDezMaiorIgualVinte);
        System.out.println("isDezIgualVinte --> "+ isDezIgualVinte);
        System.out.println("isDezDiferenteVinte --> "+ isDezDiferenteVinte);

        //academy.devdojo.maratonajava.operadores lógicos
        //&& -> (AND); || -> (OR); ! -> NEGAÇÃO
        int idade = 29;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrent = 200;
        double valorTotalContaPoupanca = 10000;
        float valorGame = 5000;
        boolean isGameCompravel =
                (valorTotalContaCorrent > valorGame)
                        || (valorTotalContaPoupanca > valorGame);
        System.out.println("isGameCompravel " + isGameCompravel);

//      academy.devdojo.maratonajava.operadores de atribuição
//      += ; -=; *=; /=
        double bonus = 2000;
        bonus += 1000;
        bonus -= 1000;
        bonus /= 2;
        bonus *= 2;
        System.out.println(bonus);
        // ++ --
        int contador = 0;
        contador += 1;
        System.out.println(contador);
        contador++;
        System.out.println(contador);
        contador--;
        System.out.println(contador);
        ++contador;
        System.out.println(contador);
        --contador;
        System.out.println(contador);





    }
}
