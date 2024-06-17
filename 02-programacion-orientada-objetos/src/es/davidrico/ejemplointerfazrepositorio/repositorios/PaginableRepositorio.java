package es.davidrico.ejemplointerfazrepositorio.repositorios;

import es.davidrico.ejemplointerfazrepositorio.modelos.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}
