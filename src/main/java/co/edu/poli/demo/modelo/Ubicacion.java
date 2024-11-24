package co.edu.poli.demo.modelo;

import java.io.Serializable;

/**
 * 
 */
public class Ubicacion implements Serializable  {

    // Atributos
    private String id;
    private double longitud;
    private double latitud;

    /**
     * Constructor con parámetros para inicializar los atributos
     */
    public Ubicacion(String id, double longitud, double latitud) {
        this.id = id;
        this.longitud = longitud;
        this.latitud = latitud;
    }

    /**
     * Método getter para id
     */
    public String getId() {
        return id;
    }

    /**
     * Método setter para id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Método getter para longitud
     */
    public double getLongitud() {
        return longitud;
    }

    /**
     * Método setter para longitud
     */
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    /**
     * Método getter para latitud
     */
    public double getLatitud() {
        return latitud;
    }

    /**
     * Método setter para latitud
     */
    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    /**
     * Método toString que devuelve una representación en cadena del objeto Ubicacion
     */
    @Override
    public String toString() {
        return "Ubicacion{" +
               "id='" + id + '\'' +
               ", longitud=" + longitud +
               ", latitud=" + latitud +
               '}';
    }
}
