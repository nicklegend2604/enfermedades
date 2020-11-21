package models;

import java.io.Serializable;
import java.sql.Blob;
import java.util.HashSet;
import java.util.Set;

public class Enfermedad implements Serializable{
    
    private Integer id;
    private Blob descripcion;
    private String nombre;
    private Set<Vacuna> vacunas = new HashSet<>(0);

    public Enfermedad() {
    }

    public Enfermedad(Integer id, Blob descripcion, String nombre) {
        this.id = id;
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Blob getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(Blob descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Vacuna> getVacunas() {
        return vacunas;
    }

    public void setVacunas(Set<Vacuna> vacunas) {
        this.vacunas = vacunas;
    }
    
}
