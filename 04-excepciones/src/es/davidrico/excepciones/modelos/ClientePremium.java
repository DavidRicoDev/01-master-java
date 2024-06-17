package es.davidrico.excepciones.modelos;

public class ClientePremium  extends Cliente implements Comparable<es.davidrico.genericos.modelos.ClientePremium>{
    public ClientePremium(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public int compareTo(es.davidrico.genericos.modelos.ClientePremium o) {
        return 0;
    }
}
