/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behemoth_steuerung;

/**
 *
 * @author bastian
 */
import behemoth_steuerung.Antriebsstrang;

public class Behemoth_Steuerung {

    /**
     * @param args the command line arguments
     */
    public String Programmier_Status = "virtuell_0.1";
    public static String Fahrbefehl = "1*x";
    public static void main(String[] args) {
        // TODO code application logic here
        Antriebsstrang antriebsstrang = new Antriebsstrang();
        virtuelle_antriebssteuerung.Virtuelle_Antriebssteuerung.main(Fahrbefehl);
    }
    
}
