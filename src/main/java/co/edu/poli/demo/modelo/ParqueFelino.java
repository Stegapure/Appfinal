package co.edu.poli.demo.modelo;

import java.io.Serializable;

/**
 * Clase ParqueFelino que extiende Espacio.
 */
public class ParqueFelino extends Espacio implements Serializable  {

    /**
     * Indica si el parque felino tiene juegos.
     */
    private boolean tieneJuegos;

    public ParqueFelino(boolean tieneJuegos, String id, String nombre, double capacidad, boolean disponible, Ubicacion ubicacion) {
        super(id, nombre, capacidad, disponible, ubicacion);
        this.tieneJuegos = tieneJuegos;
    }

   

    /**
     * Obtiene si el parque felino tiene juegos.
     *
     * @return `true` si tiene juegos, `false` en caso contrario.
     */
    public boolean isTieneJuegos() {
        return tieneJuegos;
    }

    /**
     * Establece si el parque felino tiene juegos.
     *
     * @param tieneJuegos Nuevo estado de juegos en el parque.
     */
    public void setTieneJuegos(boolean tieneJuegos) {
        this.tieneJuegos = tieneJuegos;
    }

    /**
     * Representación en cadena de la clase ParqueFelino.
     *
     * @return Información del parque felino como cadena.
     */
    @Override
    public String toString() {
        return "ParqueFelino{" +
                "tieneJuegos=" + tieneJuegos +
                ", " + super.toString() +
                '}';
    }
}
