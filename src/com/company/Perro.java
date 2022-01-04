package com.company;

public class Perro extends Animal{
    public Perro(String nombre, Integer peso, String habitat, boolean peligroDeExtincion) {
        super(nombre, peso, habitat, peligroDeExtincion);
    }

    public String comunicarse() {
        return "Ladrido";
    }
}
