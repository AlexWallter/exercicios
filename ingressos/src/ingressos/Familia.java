package ingressos;

public class Familia extends Ingresso {
    private int numOfMembers;

    public Familia(int numOfMembers) {
        this.numOfMembers = numOfMembers;
    }

    @Override
    public void setPrice(double price) {
        if(numOfMembers > 3) {
        super.setPrice(price * 0.95);
        } 
        else {
            super.setPrice(price);
        }
    }
}