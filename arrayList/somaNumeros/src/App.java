import classes.SomaNumeros;

public class App {
    public static void main(String[] args) throws Exception {
        SomaNumeros lista = new SomaNumeros();
        lista.adicionarNumero(2);
        lista.adicionarNumero(99);
        lista.adicionarNumero(7);
        lista.adicionarNumero(1);

        lista.encontrarMaiorNumero();
        lista.encontrarMenorNumero();
        lista.exibirNumeros();
        lista.calcularSoma();
    }
}
