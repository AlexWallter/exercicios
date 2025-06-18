package ingressos;

public class Ingresso {
    private double price;
    private String movieTitle;
    private boolean isSub;
    
    //GETTERS

    public double getPrice() {
        return price;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public boolean getIsSub() {
        return isSub;
    }

    //SETTERS

    public void setPrice(double price) {
        this.price = price;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public void setIsSub(boolean isSub) {
        this.isSub = isSub;
    }
}