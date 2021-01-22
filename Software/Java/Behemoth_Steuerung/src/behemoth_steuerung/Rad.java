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

public class Rad {
    private double radius = 0.0001;
    
    public Rad()
    {
        
    }
    public Rad(double init_radius)
    {
        
    }
    
    public void set_radius(double public_radius)
    {
        radius = public_radius;
    }
    
    public double get_radius()
    {
        return radius;
    }
    
    public double get_Distanz_per_Umdrehung()
    {
        return 2 * Math.PI * get_radius();
    }
}
