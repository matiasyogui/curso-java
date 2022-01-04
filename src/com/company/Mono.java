package com.company;

public class Mono extends Animal {
    public Mono(String nombre, Integer peso, String habitat, boolean peligroDeExtincion) {
        super(nombre, peso, habitat, peligroDeExtincion);
    }

    public String comunicarse() {
        return "Chillido";
    }
}
