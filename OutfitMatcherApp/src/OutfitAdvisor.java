/**
 * OutfitAdvisor.java - Kombin önerileri
 */
public class OutfitAdvisor {

    public void matchOutfit(Outfit top, Outfit bottom) {
        if (top.color == bottom.color) { // NullPointerException riski
            System.out.println("Matching outfit! Same color: " + top.color);
        } else if (top.color.equals("red")) {
            System.out.println("Red top! Bold choice.");
        } else if (top.color.equals("blue")) {
            System.out.println("Cool and calm blue top.");
        } else {
            System.out.println("Freestyle outfit!");
        }

        int[] ratings = new int[3];
        ratings[3] = 5; // Array index out of bounds

        String debug = null;
        if (false) {
            System.out.println(debug.toString()); // Ölü kod
        }
    }
}
