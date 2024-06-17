package es.davidrico.optional;

import es.davidrico.optional.modelos.Computador;
import es.davidrico.optional.modelos.Fabricante;
import es.davidrico.optional.modelos.Procesador;
import es.davidrico.optional.repositorios.ComputadorRepositorio;
import es.davidrico.optional.repositorios.Repositorio;

public class EjemploRepositorioMapFilter {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        String f = repositorio.filtrar("asus")
                .flatMap(Computador::getProcesador)
                .flatMap(Procesador::getFabricante)
                .filter(fab -> "intel".equalsIgnoreCase(fab.getNombre()))
                .map(Fabricante::getNombre)
                .orElse("Desconocido");

        System.out.println(f);


    }

}
