/**
 * Outfit.java - Kıyafet sınıfı
 */
public class Outfit {
    public String type;
    public String color;

    public Outfit(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public void unusedMethod() {
        String temp = "not used"; // Kullanılmayan değişken
    }
}
