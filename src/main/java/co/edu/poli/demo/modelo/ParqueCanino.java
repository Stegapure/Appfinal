package co.edu.poli.demo.modelo;

import java.io.Serializable;

/**
 * Clase ParqueCanino que extiende Espacio.
 */
public class ParqueCanino extends Espacio implements Serializable  {

    /**
     * Indica si el parque canino tiene agua potable.
     */
    private boolean tieneAguaPotable;

    public ParqueCanino(boolean tieneAguaPotable, String id, String nombre, double capacidad, boolean disponible, Ubicacion ubicacion) {
        super(id, nombre, capacidad, disponible, ubicacion);
        this.tieneAguaPotable = tieneAguaPotable;
    }

 

    /**
     * Obtiene si el parque canino tiene agua potable.
     *
     * @return `true` si tiene agua potable, `false` en caso contrario.
     */
    public boolean isTieneAguaPotable() {
        return tieneAguaPotable;
    }

    /**
     * Establece si el parque canino tiene agua potable.
     *
     * @param tieneAguaPotable Nuevo estado de agua potable en el parque.
     */
    public void setTieneAguaPotable(boolean tieneAguaPotable) {
        this.tieneAguaPotable = tieneAguaPotable;
    }

    /**
     * Representación en cadena de la clase ParqueCanino.
     *
     * @return Información del parque canino como cadena.
     */
    @Override
    public String toString() {
        return "ParqueCanino{" +
                "tieneAguaPotable=" + tieneAguaPotable +
                ", " + super.toString() +
                '}';
    }
}
