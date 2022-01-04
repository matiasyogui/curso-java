package com.company;

import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;
import java.time.Clock;
import java.time.Duration;

public class Main {
    public static void agregarPais(ArrayList<Pais> paises, Integer id, String nombre, Integer codigoDeArea){
        paises.add(new Pais(id, nombre, codigoDeArea));
    }

    public static List<Pais> buscarPais(ArrayList<Pais> paises, int codigoDeArea){
        return paises.stream().filter(pais -> pais.getCodigoDeArea() == codigoDeArea).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Clock baseClock = Clock.systemUTC();
        Instant instant1 = baseClock.instant();

        ArrayList<Pais> paises = new ArrayList<>();
        int id = 0;
        String nombre = "";
        int codigoDeArea = 0;
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        while(!nombre.equals("0")) {
            System.out.println("Ingrese el nombre del pais: (Se corta con 0)");
            nombre = scanner.next();

            if(!nombre.equals("0")){
                System.out.println("Ingrese el codigo de area del pais: ");
                codigoDeArea = scanner.nextInt();
                id = id + 1;
                agregarPais(paises, id, nombre, codigoDeArea);
            }
        }


        System.out.println("\nAhora ingrese el codigo de area de un pais a buscar: ");
        int codigoDeAreaABuscar = scanner.nextInt();
        List <Pais> paisesFiltrados = buscarPais(paises, codigoDeAreaABuscar);

        if(paisesFiltrados.isEmpty()){
            System.out.println("No se encontraron paises con ese codigo de area.");
        }else{
            System.out.println(paisesFiltrados);
        }

        Instant instant2 = baseClock.instant();

        System.out.println("La ejecucion del programa empezo " + instant1 + " y termino " + instant2);
    }
}
