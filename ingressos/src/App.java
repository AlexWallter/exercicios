import ingressos.*;

public class App {
    public static void main(String[] args) throws Exception {
        //EXEMPLE-1-INGRESSO
        System.out.println("");
        System.out.println("==========01==========");
        Ingresso ingresso1 = new Ingresso();

        ingresso1.setMovieTitle("exhuma");
        ingresso1.setPrice(40);
        ingresso1.setIsSub(true);
        
        System.out.println("Titulo do filme: " + ingresso1.getMovieTitle());
        System.out.println("Preço: " + ingresso1.getPrice());
        System.out.println("O filme é legendado: " + ingresso1.getIsSub());
        System.out.println("======================");

        //EXEMPLE-2-MEIA ENTRADA

        System.out.println("");
        System.out.println("==========02==========");
        MeiaEntrada meiaEntrada = new MeiaEntrada();

        meiaEntrada.setMovieTitle("Ogiva");
        meiaEntrada.setPrice(50);
        meiaEntrada.setIsSub(false);

        System.out.println("Titulo do filme: " + meiaEntrada.getMovieTitle());
        System.out.println("Preço: " + meiaEntrada.getPrice());
        System.out.println("O filme é legendado: " + meiaEntrada.getIsSub());
        System.out.println("======================");

        //EXEMPLE-3-FAMILIA

        System.out.println("");
        System.out.println("==========03==========");
        Familia familia = new Familia(5);

        familia.setMovieTitle("Velozes e furiosos parte 52");
        familia.setPrice(50);
        familia.setIsSub(false);

        System.out.println("Titulo do filme: " + familia.getMovieTitle());
        System.out.println("Preço: " + familia.getPrice());
        System.out.println("O filme é legendado: " + familia.getIsSub());
        System.out.println("======================");
    }
}
