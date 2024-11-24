package co.edu.poli.demo.modelo;

import java.io.Serializable;

/**
 * Clase Gato que extiende Mascota.
 */
public class Gato extends Mascota implements Serializable  {

    /**
     * Indica si el gato es de interior.
     */
    private boolean esIndoor;

    public Gato(boolean esIndoor, String id, String nombre, int edad, String especie) {
        super(id, nombre, edad, especie);
        this.esIndoor = esIndoor;
    }


    /**
     * Obtiene si el gato es de interior.
     *
     * @return `true` si el gato es de interior, `false` en caso contrario.
     */
    public boolean isEsIndoor() {
        return esIndoor;
    }

    /**
     * Establece si el gato es de interior.
     *
     * @param esIndoor Nuevo estado de interioridad del gato.
     */
    public void setEsIndoor(boolean esIndoor) {
        this.esIndoor = esIndoor;
    }

    /**
     * Método para simular el sonido que hace el gato.
     *
     * @return Un texto que representa el sonido del gato.
     */
    @Override
    public String hacerSonido() {
        return "Miau";
    }

    /**
     * Método que describe la interacción del gato con un láser.
     *
     * @return Texto que describe la acción del gato.
     */
    public String jugarConLaser() {
        return "El gato persigue el punto láser frenéticamente.";
    }

    /**
     * Representación en cadena de la clase Gato.
     *
     * @return Información del gato como cadena.
     */
    @Override
    public String toString() {
        return "Gato{" +
                "esIndoor=" + esIndoor + ", "+ super.toString() +
                '}';
    }
}
