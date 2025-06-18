package ingressos;

public class MeiaEntrada extends Ingresso {
    @Override
    public void setPrice(double price) {
        super.setPrice(price/2);
    }
}