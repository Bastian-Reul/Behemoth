/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behemoth_steuerung;
import behemoth_steuerung.Rad;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author bastian
 */
public class Antriebsstrang {
    public Antriebsstrang()
    {
        double Raederradius_in_m = 0.04; //Geschätzt!!!
        List<Rad> Linke_Seite = new ArrayList<Rad>();
        for (int i = 0; i < 3; i++) {
          Linke_Seite.add(new Rad(Raederradius_in_m));  
        }
        List<Rad> Rechte_Seite = new ArrayList<Rad>();
        for (int i = 0; i < 3; i++) {
          Rechte_Seite.add(new Rad(Raederradius_in_m));  
        }
        
    }
}
