package es.davidrico.excepciones.repositorios;

public interface OrdenablePaginableCrudRepositorio<T> extends OrdenableRepositorio<T>,
        PaginableRepositorio<T>, CrudRepositorio<T>, ContableRepositorio {
}
