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
    String enfermedadDonador;
    int parentezco;
    int porcentajeInicial;
    String enfermedadR;
    MatrizTipoSangre miMatriz = new MatrizTipoSangre();

    public DonanteCompatible() {

    }

    public DonanteCompatible(String tipoSangreDonante,
            String enfermedades, int parentezco, String tipoSangreReceptor) {

        this.enfermedadDonador = enfermedades;
        this.parentezco = parentezco;
        this.tipoSangreD = tipoSangreDonante;
        this.tipoSangreR = tipoSangreReceptor;
        this.porcentajeInicial = miMatriz.calcularPorcentajeCompatibilidadSangre(tipoSangreReceptor, tipoSangreDonante);

    }

    public String getTipoSangreR() {
        return tipoSangreR;
    }

    public void setTipoSangreR(String tipoSangreR) {
        this.tipoSangreR = tipoSangreR;
    }

    public String getEnfermedadR() {
        return enfermedadR;
    }

    public void setEnfermedadR(String enfermedadR) {
        this.enfermedadR = enfermedadR;
    }

    public int calcularPorcentajeCompatibilidadParentezco() {
        if (parentezco == 1) {
            porcentajeInicial -= 25;
        }
        if (parentezco == 2 || parentezco == 3) {
            porcentajeInicial -= 37;
        }
        return porcentajeInicial;
    }

    public int calcularPorcentajeCompatibilidadEnfermedad() {

        switch (enfermedadDonador) {

            case "Enfermedad Renal Crónica":
                porcentajeInicial = 0;
                break;

            case "Presión Arterial Alta":
                porcentajeInicial -= 29;
                break;

            case "Diabetes":
                porcentajeInicial -= 9;
                break;
                
            case "Hepatitis tipo C":
                porcentajeInicial -= 25;
                break;
                
            case "VIH":
                porcentajeInicial -= 5;
                break;
                
            case "Enfermedad Cardiaca":
                porcentajeInicial -= 70;
                break;
                

        }

        /*
        if (enfermedadDonador.equals(enfermedadR)) {
            porcentajeInicial = 0;
        }
        if (enfermedadDonador.equals("Enfermedad Renal Crónica")) {
            porcentajeInicial = 0;
        }
        if (enfermedadDonador.equals("Presión Arterial Alta")) {
            porcentajeInicial -= 29;
        }
        if (enfermedadDonador.equals("Diabetes")) {
            porcentajeInicial -= 9;
        }
        if (enfermedadDonador.equals("Hepatitis Tipo C")) {
            porcentajeInicial -= 25;
        }
        if (enfermedadDonador.equals("VIH")) {
            porcentajeInicial -= 5;
        }
        if (enfermedadDonador.equals("Enfermedad Cardiaca")) {
            porcentajeInicial -= 25;
        }*/

        return porcentajeInicial;
    }

    public int calcularPorcenteCompatibilidadTotal() {
        calcularPorcentajeCompatibilidadParentezco();
        calcularPorcentajeCompatibilidadEnfermedad();
        porcentajeTotal = porcentajeInicial;
        return porcentajeTotal;
    }
}
