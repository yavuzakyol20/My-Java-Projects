import javax.swing.*;

public class Price_Calculation {
    public static void main(String[] args) {
        String navn_1 = JOptionPane.showInputDialog("Skriv inn navn for vare 1: ");
        String  antall_1 = JOptionPane.showInputDialog("Skriv inn antall for vare 1: ");
        String  pris_1 = JOptionPane.showInputDialog("Skriv inn pris for vare 1: ");

        String navn_2 = JOptionPane.showInputDialog("Skriv inn navn for vare 2: ");
        String  antall_2 = JOptionPane.showInputDialog("Skriv inn antall for vare 2: ");
        String  pris_2 = JOptionPane.showInputDialog("Skriv inn pris for vare 2: ");

        int intAntall_1 = 0;
        double doublePris_1 = 0;
        try{
            intAntall_1 = Integer.parseInt(antall_1); // antall_1 ble konvert til integer
            doublePris_1 = Double.parseDouble(pris_1); // pris_1 ble konvert til double
        }
        catch (Exception e){
            System.out.println("There has been an error while parsing antall or pris --> " + e);
        }


        int intAntall_2 = 0;
        double doublePris_2 = 0;
        try{
            intAntall_2 = Integer.parseInt(antall_2); // antall_2 ble konvert til integer
            doublePris_2 = Double.parseDouble(pris_2); // pris_2 ble konvert til double
        }
        catch (Exception e){
            System.out.println("There has been an error while parsing antall or pris --> " + e);
        }


        // opprett to vare-objekter med de innleste verdiene
        Vare vare_1 = new Vare(navn_1,intAntall_1,doublePris_1);
        Vare vare_2 = new Vare(navn_2,intAntall_2,doublePris_2);


        System.out.println("Vare 1 = " + vare_1.getNavn() +
                "\nAntall: " + vare_1.getAntall() +
                "\nPris :" + vare_1.getPris() +" kr");


        System.out.println("Vare 2 = " + vare_2.getNavn() +
                "\nAntall: " + vare_2.getAntall() +
                "\nPris :" + vare_2.getPris() + " kr");

        double totalPris = vare_1.totalPris() + vare_2.totalPris();
        System.out.println("Totalprisen ble " + totalPris + " kr");
    }
}
