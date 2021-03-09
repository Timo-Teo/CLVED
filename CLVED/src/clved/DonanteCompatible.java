/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clved;

/**
 *
 * @author Tim
 */
public class DonanteCompatible {
    
    int porcentajeTotal;
    String tipoSangreR;
    String tipoSangreD;
    String enfermedad;
    int parentezco;
    int porcentajeInical;
    String enfermedadR;
    MatrizTipoSangre miMatriz = new MatrizTipoSangre();
    
    public DonanteCompatible (String tipoSangreReceptor, String tipoSangreDonante,
                                String enfermedades, int parentezco, String enfermedadReceptor){
        
        this.enfermedad = enfermedades;
        this.parentezco = parentezco;
        this.tipoSangreD = tipoSangreDonante;
        this.tipoSangreR =  tipoSangreReceptor;
        this.enfermedadR = enfermedadReceptor;
        this.porcentajeInical = miMatriz.calcularPorcentajeCompatibilidadSangre(tipoSangreReceptor, tipoSangreDonante);
        
    }
    
    public int calcularPorcentajeCompatibilidadParentezco(){
        if( parentezco == 1){
            porcentajeInical -= 25;
        }
        if(parentezco == 2 || parentezco == 3){
            porcentajeInical -= 37;
        }
        return porcentajeInical;
    }
    
    public int calcularPorcentajeCompatibilidadEnfermedad(){
        
        if(enfermedad.equals(enfermedadR)){
            porcentajeInical = 0;
        }
        if(enfermedad.equals("Enfermedad Renal Crónica")){
            porcentajeInical = 0;
        }
        if(enfermedad.equals("Presión Arterial Alta")){
            porcentajeInical -= 29;
        }
        if(enfermedad.equals("Diabetes")){
            porcentajeInical -= 9;
        }
        if(enfermedad.equals("Hepatitis Tipo C")){
            porcentajeInical -= 25 ;
        }
        if(enfermedad.equals("VIH")){
            porcentajeInical -= 5 ;
        }
        if(enfermedad.equals("Enfermedad Cardiaca")){
            porcentajeInical -= 25 ;
        }

        return porcentajeInical;
    }
    
    
    
    
}
