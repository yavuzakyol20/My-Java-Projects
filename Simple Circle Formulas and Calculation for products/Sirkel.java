public class Sirkel {
    public static double diameter(double r) { // returneres diameter
        return 2 * r;
    }
    public static double omkrets(double r) { // returneres omkrets
        //double omkrets = 2 * Math.PI * r;
        return 2 * Math.PI * r;
    }
    public static double areal(double r){ // returneres areal
        //double areal = Math.PI * Math.pow(r , 2);
        return Math.PI * Math.pow(r , 2);
    }
}
