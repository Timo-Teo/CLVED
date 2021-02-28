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
public class Donante {
    
    private String nombreDonante;
    private String apellidoDonante;
    private int edadDonante;
    private String sexoDonante;
    private String tipoSangreDonante;
    private String enfermedadDonante;
    private String parentezco;

    public Donante(String nombreDonante, String apellidoDonante, int edadDonante, 
            String sexoDonante, String tipoSangreDonante, String enfermedadDonante, String parentezco) {
        this.nombreDonante = nombreDonante;
        this.apellidoDonante = apellidoDonante;
        this.edadDonante = edadDonante;
        this.sexoDonante = sexoDonante;
        this.tipoSangreDonante = tipoSangreDonante;
        this.enfermedadDonante = enfermedadDonante;
        this.parentezco = parentezco;
    }

    public String getNombreDonante() {
        return nombreDonante;
    }

    public void setNombreDonante(String nombreDonante) {
        this.nombreDonante = nombreDonante;
    }

    public String getApellidoDonante() {
        return apellidoDonante;
    }

    public void setApellidoDonante(String apellidoDonante) {
        this.apellidoDonante = apellidoDonante;
    }

    public int getEdadDonante() {
        return edadDonante;
    }

    public void setEdadDonante(int edadDonante) {
        this.edadDonante = edadDonante;
    }

    public String getSexoDonante() {
        return sexoDonante;
    }

    public void setSexoDonante(String sexoDonante) {
        this.sexoDonante = sexoDonante;
    }

    public String getTipoSangreDonante() {
        return tipoSangreDonante;
    }

    public void setTipoSangreDonante(String tipoSangreDonante) {
        this.tipoSangreDonante = tipoSangreDonante;
    }

    public String getEnfermedadDonante() {
        return enfermedadDonante;
    }

    public void setEnfermedadDonante(String enfermedadDonante) {
        this.enfermedadDonante = enfermedadDonante;
    }

    public String getParentezco() {
        return parentezco;
    }

    public void setParentezco(String parentezco) {
        this.parentezco = parentezco;
    }

    @Override
    public String toString() {
        return "nombre Donante: " + nombreDonante + "\napellidoDonante: " + apellidoDonante + "\ntipoSangreDonante: " 
                + tipoSangreDonante + "\nenfermedad: " + enfermedadDonante + "\nparentezco: " + parentezco;
    }
    
    
    
    
    
    
    
}
