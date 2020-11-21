package models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Vacuna implements Serializable{
    
    private Integer id;
    private String nombre;
    private byte[] descripcion;
    private Set<Enfermedad> enfermedades = new HashSet<>(0);

    public Vacuna() {
    }

    public Vacuna(Integer id, String nombre, byte[] descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte[] getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(byte[] descripcion) {
        this.descripcion = descripcion;
    }

    public Set<Enfermedad> getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(Set<Enfermedad> enfermedades) {
        this.enfermedades = enfermedades;
    }
    
}
