/*
 * Clase Especialidad
 */
package parcial2_belizkaren;

import java.util.ArrayList;//Con esta librería podremos guaradar objrtos
/**
 *
 * @author Usuario
 */
public class Especialidad {
    //Definí sus atributos
    private int id;
    private String nombre;
    private ArrayList<Turno> turnos;//En esta lista se van a guardar objrtos tipos Turno
    
    //Definí tres constructores para crear el objeto
    //Constructor vacío
    public Especialidad(){
        this.setId(0);
        this.setNombre("");
        this.setTurnos(new ArrayList<Turno>());
    }
    
    //Constructor completo
    public Especialidad(int id, String nombre, ArrayList<Turno> turList){
        this.setId(id);
        this.setNombre(nombre);
        this.setTurnos(turList);
    }
    
    //Constructor que acepta id u nombre pero no lista de turnos
    public Especialidad(int id, String nombre){
        this.setId(id);
        this.setNombre(nombre);
        this.setTurnos(new ArrayList<Turno>());
    }
    
    //Definí los métodos

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(ArrayList<Turno> turnos) {
        this.turnos = turnos;
    }
    
    
}
