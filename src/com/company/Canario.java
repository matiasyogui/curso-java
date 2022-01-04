package com.company;

public class Canario extends Animal {
    public Canario(String nombre, Integer peso, String habitat, boolean peligroDeExtincion) {
        super(nombre, peso, habitat, peligroDeExtincion);
    }

    public String comunicarse() {
        return "Trino";
    }
}
