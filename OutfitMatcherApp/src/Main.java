/**
 * Main.java - Uygulamanın giriş noktası
 */
public class Main {
    public static void main(String[] args) {
        Outfit topWear = new Outfit("T-shirt", "blue");
        Outfit bottomWear = new Outfit("Jeans", "black");
        Outfit nullWear = null; // Null pointer olasılığı

        OutfitAdvisor advisor = new OutfitAdvisor();
        advisor.matchOutfit(topWear, bottomWear);
        advisor.matchOutfit(nullWear, bottomWear); // Null hatası ihtimali
    }
}
