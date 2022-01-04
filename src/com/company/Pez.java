package com.company;

public class Pez extends Animal {
    public Pez(String nombre, Integer peso, String habitat, boolean peligroDeExtincion) {
        super(nombre, peso, habitat, peligroDeExtincion);
    }

    public String comunicarse() {
        return "No se puede comunicar :(";
    }
}
