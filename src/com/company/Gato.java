package com.company;

public class Gato extends Animal {
    public Gato(String nombre, Integer peso, String habitat, boolean peligroDeExtincion) {
        super(nombre, peso, habitat, peligroDeExtincion);
    }

    public String comunicarse() {
        return "Maullido";
    }
}
