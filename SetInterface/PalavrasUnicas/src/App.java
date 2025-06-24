import classes.ConjuntoPalavrasUnicas;

public class App {
    public static void main(String[] args) throws Exception {
        ConjuntoPalavrasUnicas setPalavras = new ConjuntoPalavrasUnicas();
        
        setPalavras.adicionarPalavra("palavra");
        setPalavras.adicionarPalavra("testando");
        setPalavras.adicionarPalavra("tentativa");
        setPalavras.adicionarPalavra("palavra");
        
        setPalavras.exibirPalavras();
        
        setPalavras.verificarPalavra("testando");
        setPalavras.removerPalavra("palavra");
        

        setPalavras.exibirPalavras();
    }
}
