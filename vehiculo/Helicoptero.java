
/**
 * Write a description of class Helicoptero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Helicoptero extends Aereo
{
    // instance variables - replace the example below with your own
    private double estabilidad;
    private int pasajeros;
    private int capacidad;
    private String tamaño;
    private int motor;
    private String seguridad;
    
    public Helicoptero (double es, int p, int k, String ta, int mot, String seg){
    this.estabilidad = es;
    this.pasajeros = p;
    this.capacidad = k;
    this.tamaño =ta;
    this.motor = mot;
    this.seguridad = seg;
    }
    public void comodidad(){
    System.out.println(" vista previa");
    }
}
