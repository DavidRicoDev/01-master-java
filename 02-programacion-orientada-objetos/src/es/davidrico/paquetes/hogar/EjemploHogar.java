package es.davidrico.paquetes.hogar;

import es.davidrico.paquetes.jardin.Perro;

import static es.davidrico.paquetes.hogar.Persona.saludar;

public class EjemploHogar {
    public static void main(String[] args) {
        Persona p = new Persona();
        Perro perro = new Perro();
        String saludo = saludar();
    }
}
