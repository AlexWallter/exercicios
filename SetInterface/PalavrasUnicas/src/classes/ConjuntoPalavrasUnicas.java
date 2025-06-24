package classes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    Set<String> palavrasUniSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUniSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUniSet.add(palavra);
    }

    public void verificarPalavra(String palavra) {
        if(palavrasUniSet.contains(palavra)) {
            System.out.println("A palavra foi encontrada dentro do conjunto.");
        }
        else {
            System.out.println("A palavra não foi encontrada dentro do conjunto.");
        }
    }
    
    public void removerPalavra(String palavra) {
        if(!palavrasUniSet.isEmpty() && palavrasUniSet.contains(palavra)) {
            palavrasUniSet.remove(palavra);
            System.out.println("Palavra removida com sucesso.");
        }
        else {
            System.out.println("A palavra não existe dentro do conjunto.");   
        }
    }

    public void exibirPalavras() {
        System.out.println(palavrasUniSet);
    }
}
