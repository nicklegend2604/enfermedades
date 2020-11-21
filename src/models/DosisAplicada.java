package models;

import java.io.Serializable;
import java.util.Date;

public class DosisAplicada implements Serializable{
    
    private Integer id;
    private Date fechaAplicacion;
    private Historial historial;
    private Dosis dosis;

    public DosisAplicada() {
    }

    public DosisAplicada(Integer id, Date fechaAplicacion, Historial historial, Dosis dosis) {
        this.id = id;
        this.fechaAplicacion = fechaAplicacion;
        this.historial = historial;
        this.dosis = dosis;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaAplicacion() {
        return fechaAplicacion;
    }

    public void setFechaAplicacion(Date fechaAplicacion) {
        this.fechaAplicacion = fechaAplicacion;
    }

    public Historial getHistorial() {
        return historial;
    }

    public void setHistorial(Historial historial) {
        this.historial = historial;
    }

    public Dosis getDosis() {
        return dosis;
    }

    public void setDosis(Dosis dosis) {
        this.dosis = dosis;
    }
    
    
    
}
