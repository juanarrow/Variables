package tema2.Ejercicio5;

public class Ejercicio5 {
    public static void ejercicio4(){
        int pesetas = 1000;
        final double PESETAS_EURO = 166.386;
        double euros = pesetas / PESETAS_EURO;
        System.out.printf("%d pesetas son %.2f euros%n", pesetas, euros);
    }
}
