public class Circle_Formulas {
    public static void main(String[] args) {
        double r = 23.5; // radius is 23.5
        System.out.println("Arealet av sirkelen med radius " + r + " er " + String.format("%.2f", Sirkel.areal(r)));
        System.out.println("Omkretsen av sirkelen med radius " + r + " er " + String.format("%.2f", Sirkel.omkrets(r)));
        System.out.println("Diameteren til sirkelen er med radius " + r + " er " + String.format("%.2f", Sirkel.diameter(r)));
    }
}