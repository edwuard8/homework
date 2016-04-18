
/**
 * Write a description of class futbolista here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class futbolista extends seleccionfutbol
{
    // instance variables - replace the example below with your own
    private String rendimiento;
    private String velocidad;
    private String pases;
    private String asistencia;
    
    public futbolista (String rendi, String velc, String pas, String asist){
     this.rendimiento = rendi;
     this.velocidad = velc;
     this.pases = pas;
     this.asistencia = asist;
    }
    public void tiros(){
     System.out.println("probabilidad de anotar 50/50");
    }
}
