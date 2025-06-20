package classes;

import java.util.ArrayList;
import java.util.Collections;

public class SomaNumeros {
    ArrayList<Integer> numList;

    public SomaNumeros() {
        this.numList = new ArrayList<>();
    }

    public void adicionarNumero(int num) {
        numList.add(num);
    }

    public void calcularSoma() {
        int count = 0;
        for (Integer i : numList) {
            count += i;
        }

        System.out.println("A soma de todos os números é: " + count);
    }

    public void encontrarMaiorNumero() {
        Collections.sort(numList);
        System.out.println(numList.getLast());
    }

    public void encontrarMenorNumero() {
        Collections.sort(numList);
        System.out.println(numList.getFirst());
    }

    public void exibirNumeros() {
        System.out.println(numList);
    }
}