import listaTarefa.ListaTarefa;

public class App {
    public static void main(String[] args) throws Exception {
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.AdicionarTarefa("teste", false);
        listaTarefa.AdicionarTarefa("teste2", true);
        
        listaTarefa.exibirTarefas();
    }
}
