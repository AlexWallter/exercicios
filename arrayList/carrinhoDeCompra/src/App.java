import classes.CarrinhodeCompras;

public class App {
    public static void main(String[] args) throws Exception {
        CarrinhodeCompras carrinho = new CarrinhodeCompras();

        carrinho.adicionarItem("something", 12.90, 2);
        carrinho.adicionarItem("Something else", 5.60, 1);
        carrinho.exibirItens();

        carrinho.calcularValorTotal();

        carrinho.removerItem("Something else");
        carrinho.exibirItens();

        carrinho.calcularValorTotal();
    }
}
