/*
 * Super Clase
 */
package parcial2_belizkaren;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Persona {
    //Definí los atributos
    private int id;
    private String apellido;
    private String nombres;
    private Date fechaNacimiento;
    
    //Definí los constructores para crear el objeto
    //El primer constructor es vacío y el otro es completo.
    public Persona(){
        this.setId(0);
        this.setApellido("");
        this.setNombres("");
        this.setFechaNacimiento(null);
    }
    
    public Persona(int id, String apellido, String nombres, Date fechaNacimiento){
        this.setId(id);
        this.setApellido(apellido);
        this.setNombres(nombres);
        this.setFechaNacimiento(fechaNacimiento);
    }
    
    //Definí los métodos, estos sirven para mostrar o editar cosas en los objetos de clase Persona 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    //Este es un método para mostrar nombre y apellido del objeto
    @Override
    public String toString(){
        return getApellido() + " " + getNombres();
    }
    
}
