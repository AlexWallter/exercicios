package listaTarefa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefa {
    Set<Tarefa> listaTarefa;

    public ListaTarefa() {
        this.listaTarefa = new HashSet<>();
    }

    public void AdicionarTarefa(String description, boolean isPending) {
        listaTarefa.add(new Tarefa(description, isPending));
    }
    
    public void removerTarefa(String description) {
        if(!listaTarefa.isEmpty()) {
            for (Tarefa tarefa : listaTarefa) {
                if(tarefa.description == description) {
                    listaTarefa.remove(tarefa);
                    break;
                }
            }
        }
    }

    public void exibirTarefas() {
        System.out.println(listaTarefa);
    }

    public void contarTarefas() {
        System.out.println(listaTarefa.size());
    }

    public void marcarComoConcluida(String description) {
        if(!listaTarefa.isEmpty()) {
            for (Tarefa tarefa : listaTarefa) {
                if(tarefa.getDescription() == description && tarefa.isPending) {
                    tarefa.isPending = !tarefa.isPending;
                }
            }
        }
    }

    public void marcarComoPendente(String description) {
        if(!listaTarefa.isEmpty()) {
            for (Tarefa tarefa : listaTarefa) {
                if(tarefa.getDescription() == description && !tarefa.isPending) {
                    tarefa.isPending = !tarefa.isPending;
                }
            }
        }
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if(!listaTarefa.isEmpty()) {
            for (Tarefa tarefa : listaTarefa) {
                if(!tarefa.isPending) {
                    tarefasConcluidas.add(tarefa);
                }
            }
        }

        return tarefasConcluidas;
    }

        public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if(!listaTarefa.isEmpty()) {
            for (Tarefa tarefa : listaTarefa) {
                if(tarefa.isPending) {
                    tarefasPendentes.add(tarefa);
                }
            }
        }

        return tarefasPendentes;
    }

    public void limparListaTarefa() {
        listaTarefa.removeAll(listaTarefa);
    }
}
