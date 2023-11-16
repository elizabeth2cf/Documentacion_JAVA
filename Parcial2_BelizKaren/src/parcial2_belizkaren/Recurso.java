/*
 * Clase de Recurso para generar los objetos de oficina del punto 5.
 */
package parcial2_belizkaren;

/**
 *
 * @author Usuario
 */
public class Recurso {
    
    //Definí los atributos
    private int id;
    private String nombre;
    private String tipoRecurso;
    private String descripcion;
    
    //Definí los constructores
    public Recurso(){
    this.setId(0);
    this.setNombre("");
    this.setTipoRecurso("");
    this.setDescripcion("");
    }

    public Recurso(int id, String nombre, String tipoRecurso, String descripcion) {
        this.setId(id);
        this.setNombre(nombre);
        this.setTipoRecurso(tipoRecurso);
        this.setDescripcion(descripcion);
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

    public String getTipoRecurso() {
        return tipoRecurso;
    }

    public void setTipoRecurso(String tipoRecurso) {
        this.tipoRecurso = tipoRecurso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
