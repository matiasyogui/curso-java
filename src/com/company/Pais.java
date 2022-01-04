package com.company;

public class Pais {
    private Integer id;
    private String nombre;
    private Integer codigoDeArea;

    public Pais(Integer id, String nombre, Integer codigoDeArea) {
        this.id = id;
        this.nombre = nombre;
        this.codigoDeArea = codigoDeArea;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", codigoDeArea=" + codigoDeArea +
                '}';
    }

    public Integer getCodigoDeArea() {
        return codigoDeArea;
    }
}
