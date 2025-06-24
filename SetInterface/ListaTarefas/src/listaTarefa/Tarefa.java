package listaTarefa;

public class Tarefa {
    String description;
    boolean isPending;
    
    public Tarefa(String description, boolean isPending) {
        this.description = description;
        this.isPending = isPending;
    }
    
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public boolean isPending() {
        return isPending;
    }
    public void setPending(boolean isPending) {
        this.isPending = isPending;
    }

  @Override
  public String toString() {
    return "Tarefa{" +
        "descricao='" + description + '\'' +
        ", pendente=" + isPending +
        '}';
  }
    
}
