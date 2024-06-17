package es.davidrico.ejemplointerfazrepositorio.repositorios;

import es.davidrico.ejemplointerfazrepositorio.modelos.Cliente;

import java.util.List;

public interface OrdenableRepositorio {
    List<Cliente> listar(String campo, Direccion dir);
}
