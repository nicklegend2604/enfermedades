package models;

import java.io.Serializable;

public class Dosis implements Serializable{
    private Integer id;
    private int valorTiempo;
    private String unidadTiempo;
    private Vacuna vacuna;

    public Dosis() {
    }

    public Dosis(Integer id, int valorTiempo, String unidadTiempo, Vacuna vacuna) {
        this.id = id;
        this.valorTiempo = valorTiempo;
        this.unidadTiempo = unidadTiempo;
        this.vacuna = vacuna;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getValorTiempo() {
        return valorTiempo;
    }

    public void setValorTiempo(int valorTiempo) {
        this.valorTiempo = valorTiempo;
    }

    public String getUnidadTiempo() {
        return unidadTiempo;
    }

    public void setUnidadTiempo(String unidadTiempo) {
        this.unidadTiempo = unidadTiempo;
    }

    public Vacuna getVacuna() {
        return vacuna;
    }

    public void setVacuna(Vacuna vacuna) {
        this.vacuna = vacuna;
    }
    
    
}
