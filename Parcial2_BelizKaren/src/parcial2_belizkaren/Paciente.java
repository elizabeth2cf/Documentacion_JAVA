/*
 * Clase Persona
 */
package parcial2_belizkaren;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Paciente extends Persona{
    
    /*Definí sus atributos, y al heredar de Persona,
    hereda también los atributos de esa Super Clase.
    -id apellido nombres fechNac-  que se ven en los constructores*/
    
    private int nroDocumento;
    private String domicilio;
    private String celular;
    private String obraSocial;
    private boolean activo;
    
    //Definí los constructores para crear el objeto
    //El primer constructor es vacío y el otro es completo.
    public Paciente(){
        this.setId(0);
        this.setApellido("");
        this.setNombres("");
        this.setFechaNacimiento(null);
        this.setNroDocumento(0);
        this.setDomicilio("");
        this.setCelular("");
        this.setObraSocial("");
        this.setActivo(false);
    }
    
    public Paciente(int id, String apellido, String nombres, Date fechNac,
             int nroDoc, String dom, String cel, String obraSocial, boolean activo){
        super(id,apellido,nombres,fechNac);
        this.setNroDocumento(nroDoc);
        this.setDomicilio(dom);
        this.setCelular(cel);
        this.setObraSocial(obraSocial);
        this.setActivo(activo);
    }
    
    /*Definí los métodos estos sirven para mostrar o editar 
    cosas en los objetos de clase Paciente*/ 
    
    public int getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(int nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
}
