package com.company;

public class Vaca extends Animal{
    public Vaca(String nombre, Integer peso, String habitat, boolean peligroDeExtincion) {
        super(nombre, peso, habitat, peligroDeExtincion);
    }

    public String comunicarse() {
        return "Mugido";
    }
}
