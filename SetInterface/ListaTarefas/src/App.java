import java.util.Set;
import listaTarefa.ListaTarefa;
import listaTarefa.Tarefa;

public class App {
    public static void main(String[] args) throws Exception {
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.AdicionarTarefa("teste", false);
        listaTarefa.AdicionarTarefa("teste2", true);
        listaTarefa.AdicionarTarefa("teste3", false);
        listaTarefa.AdicionarTarefa("teste4", true);
        
        listaTarefa.exibirTarefas();

        listaTarefa.contarTarefas();
       
        listaTarefa.marcarComoConcluida("teste2");
        Set<Tarefa> tarefasConcluidas = listaTarefa.obterTarefasConcluidas();
        System.out.println(tarefasConcluidas);
        
        listaTarefa.marcarComoPendente("teste3");
        Set<Tarefa> tarefasPendentes = listaTarefa.obterTarefasPendentes();
        System.out.println(tarefasPendentes);

        listaTarefa.exibirTarefas();

        listaTarefa.limparListaTarefa();
        listaTarefa.exibirTarefas();
    }
}
