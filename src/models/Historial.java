package models;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;


public class Historial implements Serializable{
    
    private Date fechaCreacion;
    private Integer idPersona;
    private Persona persona;
    private Set<DosisAplicada> listaDosisAplicada;

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

    public Set<DosisAplicada> getListaDosisAplicada() {
        return listaDosisAplicada;
    }

    public void setListaDosisAplicada(Set<DosisAplicada> listaDosisAplicada) {
        this.listaDosisAplicada = listaDosisAplicada;
    }
}
