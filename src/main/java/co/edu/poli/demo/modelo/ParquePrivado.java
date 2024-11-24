package co.edu.poli.demo.modelo;

import java.io.Serializable;

/**
 * 
 */
public class ParquePrivado extends Espacio implements Serializable {

    // Atributos
    private boolean esInterior;
    private double metrosCuadrados;

   
    @Override
    public String toString() {
        return "ParquePrivado {"+"esInterior=" + esInterior + ", metrosCuadrados=" + metrosCuadrados + ", " + super.toString() +'}';
    }

    public ParquePrivado(boolean esInterior, double metrosCuadrados, String id, String nombre, double capacidad, boolean disponible, Ubicacion ubicacion) {
        super(id, nombre, capacidad, disponible, ubicacion);
        this.esInterior = esInterior;
        this.metrosCuadrados = metrosCuadrados;
    }

    public boolean isEsInterior() {
        return esInterior;
    }

    public void setEsInterior(boolean esInterior) {
        this.esInterior = esInterior;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }



}
