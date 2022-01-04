package com.company;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Animal animalElegido;
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Elija un animal: ");
        String animalPorInput = scanner.next();

        System.out.println("Elija un nombre para el animal: ");
        String nombre = scanner.next();

        System.out.println("Elija un peso para el animal: ");
        Integer peso = scanner.nextInt();

        System.out.println("Ingrese el habitat del animal: ");
        String habitat = scanner.next();

        try{
            switch (animalPorInput.toLowerCase(Locale.ROOT)){
                case "perro":
                    animalElegido = new Perro(nombre, peso, habitat, false);
                    System.out.println(animalElegido.toString());
                    break;
                case "gato":
                    animalElegido = new Gato(nombre, peso, habitat, false);
                    System.out.println(animalElegido.toString());
                    break;
                case "vaca":
                    animalElegido = new Vaca(nombre, peso, habitat, false);
                    System.out.println(animalElegido.toString());
                    break;
                case "mono":
                    animalElegido = new Mono(nombre, peso, habitat, true);
                    System.out.println(animalElegido.toString());
                    break;
                case "canario":
                    animalElegido = new Canario(nombre, peso, habitat, true);
                    System.out.println(animalElegido.toString());
                    break;
                case "pez":
                    animalElegido = new Pez(nombre, peso, habitat, true);
                    System.out.println(animalElegido.toString());
                    break;
                default:
                    throw new InputMismatchException();
            }
        }catch(InputMismatchException error){
            System.out.println("Animal ingresado no valido.");
        }
    }
}
