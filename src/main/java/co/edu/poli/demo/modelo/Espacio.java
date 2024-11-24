package co.edu.poli.demo.modelo;

import java.io.Serializable;

/**
 * Clase Espacio que representa un espacio físico en el sistema.
 */
public class Espacio implements Serializable  {

    /**
     * Identificador único del espacio.
     */
    private String id;

    /**
     * Nombre del espacio.
     */
    private String nombre;

    /**
     * Capacidad del espacio en términos de personas o unidades.
     */
    private double capacidad;

    /**
     * Indica si el espacio está disponible.
     */
    private boolean disponible;

    /**
     * Ubicación del espacio.
     */
    private Ubicacion ubicacion;

    public Espacio(String id, String nombre, double capacidad, boolean disponible, Ubicacion ubicacion) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.disponible = disponible;
        this.ubicacion = ubicacion;
    }



   
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }
    @Override
    public String toString() {
        return "Espacio {" +
               "id='" + id + '\'' +
               ", nombre='" + nombre + '\'' +
               ", capacidad=" + capacidad +
               ", disponible=" + disponible +
               ", ubicacion=" + ubicacion +
               '}';
    }
    
}
