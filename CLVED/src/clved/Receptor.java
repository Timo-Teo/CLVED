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
public class Receptor {
    
    
    
    private String nombreReceptor;
    private String apellidoReceptor;
    private int edadReceptor;
    private String sexoReceptor;
    private String tipoSangreReceptor;
    private String enfermedadReceptor;

    public Receptor(String nombreReceptor, String apellidoReceptor, int edadReceptor,
            String sexoReceptor, String tipoSangreReceptor, String enfermedadReceptor) {
        this.nombreReceptor = nombreReceptor;
        this.apellidoReceptor = apellidoReceptor;
        this.edadReceptor = edadReceptor;
        this.sexoReceptor = sexoReceptor;
        this.tipoSangreReceptor = tipoSangreReceptor;
        this.enfermedadReceptor = enfermedadReceptor;
    }

    public String getNombreReceptor() {
        return nombreReceptor;
    }

    public void setNombreReceptor(String nombreReceptor) {
        this.nombreReceptor = nombreReceptor;
    }

    public String getApellidoReceptor() {
        return apellidoReceptor;
    }

    public void setApellidoReceptor(String apellidoReceptor) {
        this.apellidoReceptor = apellidoReceptor;
    }

    public int getEdadReceptor() {
        return edadReceptor;
    }

    public void setEdadReceptor(int edadReceptor) {
        this.edadReceptor = edadReceptor;
    }

    public String getSexoReceptor() {
        return sexoReceptor;
    }

    public void setSexoReceptor(String sexoReceptor) {
        this.sexoReceptor = sexoReceptor;
    }

    public String getTipoSangreReceptor() {
        return tipoSangreReceptor;
    }

    public void setTipoSangreReceptor(String tipoSangreReceptor) {
        this.tipoSangreReceptor = tipoSangreReceptor;
    }

    public String getEnfermedadReceptor() {
        return enfermedadReceptor;
    }

    public void setEnfermedadReceptor(String enfermedadReceptor) {
        this.enfermedadReceptor = enfermedadReceptor;
    }

    @Override
    public String toString() {
        return   "Nombre: " + nombreReceptor + "\nApellido: " + apellidoReceptor 
                + "\nEdad: " + edadReceptor + "\nSexo: " + sexoReceptor 
                + "\nTipo Sangre" + tipoSangreReceptor + "Enfermedad:" + enfermedadReceptor;
    }
    
    
    
}
