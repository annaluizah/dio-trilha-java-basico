public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Anna!");

        String meuNome = "Anna Luiza";

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        // Variáveis vs. Constantes

        int numero = 5;
        numero = 10;

        System.out.println(numero);

        // final deve-se definir a variável sempre em CAIXA ALTA
        final double VALOR_DE_PI = 3.14;
    }
}
