package es.davidrico.excepciones.modelos;

import java.util.Objects;

public class BaseEntity {
    protected Integer id;

    private static int ultimoId;

    public BaseEntity() {
        this.id = ++ultimoId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        es.davidrico.genericos.modelos.BaseEntity base = (es.davidrico.genericos.modelos.BaseEntity) o;
        return Objects.equals(id, base.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
