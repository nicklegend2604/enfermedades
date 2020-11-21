package models;

import java.io.Serializable;
import java.util.Date;


public class Historial implements Serializable{
    
    private Date fechaCreacion;
    private Integer idPersona;
    private Persona persona;

    public Historial() {
    }

    public Historial(Date fechaCreacion, Integer idPersona, Persona persona) {
        this.fechaCreacion = fechaCreacion;
        this.idPersona = idPersona;
        this.persona = persona;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
