
/**
 * Write a description of class Avion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Avion extends Aereo
{
    // instance variables - replace the example below with your own
    private int pasajerost;
    private int dimensiones;
    private String equipamiento;
    private String servicios;
    private int rapidez;
    private String clase;
    
    public Avion(int pasaj, int dimen, String equip, String serv, int rap, String cla){
    this.pasajerost = pasaj;
    this.dimensiones = dimen;
    this.equipamiento = equip;
    this.servicios = serv;
    this.rapidez = rap;
    this.clase = cla;
    }
    public void amabilidad(){
    System.out.println("Buen viaje");
    }
}
