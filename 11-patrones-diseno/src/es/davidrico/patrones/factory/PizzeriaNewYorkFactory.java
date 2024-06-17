package es.davidrico.patrones.factory;

import es.davidrico.patrones.factory.producto.PizzaNewYorkItaliana;
import es.davidrico.patrones.factory.producto.PizzaNewYorkPepperoni;
import es.davidrico.patrones.factory.producto.PizzaNewYorkVegetariana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory {
    @Override
    PizzaProducto crearPizza(String tipo) {
        return switch (tipo) {
            case "vegetariana" -> new PizzaNewYorkVegetariana();
            case "pepperoni" -> new PizzaNewYorkPepperoni();
            case "italiana" -> new PizzaNewYorkItaliana();
            default -> null;
        };
    }
}
