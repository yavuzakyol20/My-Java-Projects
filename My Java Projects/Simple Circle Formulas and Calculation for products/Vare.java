public class Vare {
    private String navn;
    private int antall;
    private double pris;

    public Vare(String navn, int antall, double pris) { // konstruktør
        this.navn = navn;
        this.antall = antall;
        this.pris = pris;
    }


    public void setNavn(String navn){
        this.navn = navn;
    }
    public String getNavn(){
        return navn;
    }

    public void setAntall(int antall){
        if(antall > 0){
            this.antall = antall;
        }
    }
    public int getAntall(){
        return antall;
    }

    public void setPris(double pris){
        if(pris > 0) {
            this.pris = pris;
        }
    }
    public double getPris(){
        return pris;
    }

    public double totalPris(){
        //double total = antall * pris;
        return antall * pris;
    }
}
