package com.company;

public abstract class Animal {
    protected String nombre;
    protected Integer peso;
    protected String habitat;
    protected boolean peligroDeExtincion;

    public Animal(){};

    public Animal(String nombre, Integer peso, String habitat, boolean peligroDeExtincion) {
        this.nombre = nombre;
        this.peso = peso;
        this.habitat = habitat;
        this.peligroDeExtincion = peligroDeExtincion;
    }

    public abstract String comunicarse();

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", peso=" + peso +
                ", habitat='" + habitat + '\'' +
                ", peligroDeExtincion=" + peligroDeExtincion +
                '}';
    }

}
