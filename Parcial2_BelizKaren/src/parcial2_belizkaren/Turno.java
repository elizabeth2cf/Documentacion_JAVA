/*
 * Clase Turno
 */
package parcial2_belizkaren;

import java.util.Date;//Clase para crear objetos en fecha

/**
 *
 * @author Usuario
 */
public class Turno {
    //Definí los constructores para crear el objeto
    private int nro;
    private Date fechaTurno;
    private Paciente paciente;//guarda un objeto paciente 

    public Turno(){
        this.setNro(0);
        this.setFechaTurno(null);
        this.setPaciente(new Paciente());
    }

    public Turno(int nro, Date fecha, Paciente p){
        this.setNro(nro);
        this.setFechaTurno(fecha);
        this.setPaciente(p);
    }
    
    //definí lo métodos
    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public Date getFechaTurno() {
        return fechaTurno;
    }

    public void setFechaTurno(Date fechaTurno) {
        this.fechaTurno = fechaTurno;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
