/*
 * Clase Profecional
 */
package parcial2_belizkaren;

import java.util.Date;//Clase para crear objetos en fecha
import java.util.TreeMap;//Clase para crear arrays tipo treeMap

/**
 *
 * @author Usuario
 */
public class Profesional extends Persona{
      
     /*Definí sus atributos, y al heredar de Persona,
        hereda también los atributos de esa Super Clase.
        -id apellido nombres fechNac- que se ven en los constructores*/
    
    private int nroMatriculo;
    private TreeMap<Integer, Especialidad> especialidades;//Esta lista guarda las especialidades que correspondan al Profecional
    
    //Definí los constructores para crear el objeto
    //El primer constructor es vacío y el otro es completo.
    
    public Profesional(int id, String apellido, String nombres, Date fechNac,
            int nroMatric, TreeMap<Integer, Especialidad> espList){
        super(id,apellido,nombres,fechNac);
        this.setNroMatriculo(nroMatric);
        this.setEspecialidades(espList);
    }
    /*Definí los métodos estos sirven para mostrar o editar 
        cosas en los objetos de clase Profesional*/
    
    public int getNroMatriculo() {
        return nroMatriculo;
    }

    public void setNroMatriculo(int nroMatriculo) {
        this.nroMatriculo = nroMatriculo;
    }

    public TreeMap<Integer, Especialidad> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(TreeMap<Integer, Especialidad> especialidades) {
        this.especialidades = especialidades;
    }
    
    //Método que crea el turno relacionando el turno y la especialidad con el profecional
    public void agendarTurno(Especialidad esp, Turno t){
        if(getEspecialidades()==null){
            setEspecialidades(new TreeMap<Integer, Especialidad>());
        }
        //el primer if genera una lista de especialidades si el profecional aún no tiene una.
        if(getEspecialidades().containsKey(esp.getId())){
            Especialidad espProfesional = getEspecialidades().get(esp.getId());
            
            int nroOrdenSiguiente = espProfesional.getTurnos().size() + 1;//acá se coloca el numero de turno
            t.setNro(nroOrdenSiguiente);
            
            espProfesional.getTurnos().add(t);
        }else{
            getEspecialidades().put(esp.getId(), esp);
            
            Especialidad espProfesional = getEspecialidades().get(esp.getId());
            
            int nroOrdenSiguiente = espProfesional.getTurnos().size() + 1;
            t.setNro(nroOrdenSiguiente);
            
            espProfesional.getTurnos().add(t);//Este turno se almacena en una lista que existe en la especialidad, así se puede filtrar el turno por especialidad y profecional
        }
    }
    //Este método lista los turnos por especialidad con los datos del turno
    public void listarTurnosPorEspecialidad(){
        System.out.println("Profesional:" + toString());
        System.out.println("--------------------------------------");
        for(Especialidad espList:getEspecialidades().values()){
            System.out.println("Especialidad:" + espList.getNombre().trim());
            System.out.println("--------------------------------------");
            for(int indexTurno=0;indexTurno<espList.getTurnos().size();indexTurno++){
                Turno t = espList.getTurnos().get(indexTurno);
                System.out.println("Turno Nro:" + t.getNro() + " Para: " + t.getPaciente().toString());
            }
            System.out.println("--------------------------------------");
            System.out.println("");
            System.out.println("");
        }
    }
}
