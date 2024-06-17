package es.davidrico.optional.repositorios;

import es.davidrico.optional.modelos.Computador;

import java.util.Optional;

public interface Repositorio<T> {

    Optional<Computador> filtrar(String nombre);

}
