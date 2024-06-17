package es.davidrico.genericos.repositorios;

import java.util.List;

public interface OrdenableRepositorio<T> {
    List<T> listar(String campo, Direccion dir);
}
