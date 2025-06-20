package classes;

import java.util.ArrayList;

public class CarrinhodeCompras {
    ArrayList<Item> itemsList;

    //CONSTRUCTOR

    public CarrinhodeCompras() {
        this.itemsList = new ArrayList<>();
    };

    //METODOS

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemsList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        if(!itemsList.isEmpty()) {
            for (Item item : itemsList) {
                if (item.getName().equalsIgnoreCase(nome)) {
                    itemsList.remove(item);
                    break;
                }
            }
        }
    }

    public void calcularValorTotal() {
        double count = 0;

        for (Item item : itemsList) {
            count+=item.getPrice() * item.getQuantity();
        }

        System.out.println("Valor total: " + count);
    }

    public void exibirItens() {
        for (Item item : itemsList) {
            System.out.println("Produto: " + item.getName() + ", " +
                                "preço: " + item.getPrice() + ", " +
                                "quantidade: " + item.getQuantity());
        }
    }
}
