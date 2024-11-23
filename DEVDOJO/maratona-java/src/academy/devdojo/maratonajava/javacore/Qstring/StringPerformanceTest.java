package academy.devdojo.maratonajava.javacore.Qstring;

public class StringPerformanceTest {
    public static void main(String[] args) {

        long inicio = System.currentTimeMillis();
        concatString(300_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto pra String " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(300_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto pra StringBuilder " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(300_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto pra StringBuffer " + (fim - inicio) + "ms");



    }

    private static void concatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);

        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho) {
        StringBuffer sb = new StringBuffer(tamanho);

        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

}
