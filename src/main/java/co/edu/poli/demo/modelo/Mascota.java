package co.edu.poli.demo.modelo;

import java.io.Serializable;

/**
 * Clase Mascota que representa una mascota genérica.
 */
public class Mascota implements Serializable {

    /**
     * Identificador único de la mascota.
     */
    private String id;

    /**
     * Nombre de la mascota.
     */
    private String nombre;

    /**
     * Edad de la mascota en años.
     */
    private int edad;

    /**
     * Especie a la que pertenece la mascota.
     */
    private String especie;

    public Mascota( String id, String nombre, int edad, String especie) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }


    /**
     * Obtiene el identificador de la mascota.
     *
     * @return Identificador de la mascota.
     */
    public String getId() {
        return id;
    }

    /**
     * Establece el identificador de la mascota.
     *
     * @param id Nuevo identificador de la mascota.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre de la mascota.
     *
     * @return Nombre de la mascota.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la mascota.
     *
     * @param nombre Nuevo nombre de la mascota.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la edad de la mascota.
     *
     * @return Edad de la mascota.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad de la mascota.
     *
     * @param edad Nueva edad de la mascota.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtiene la especie de la mascota.
     *
     * @return Especie de la mascota.
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * Establece la especie de la mascota.
     *
     * @param especie Nueva especie de la mascota.
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * Método para simular el sonido que hace la mascota.
     * Este método puede ser sobrescrito en clases derivadas.
     */
    public String hacerSonido() {
        // Devuelve una cadena en lugar de imprimir a la consola
        return "La mascota hace un sonido genérico.";
    }
    /**
     * Representación en cadena de la clase Mascota.
     *
     * @return Información de la mascota como cadena.
     */
    @Override
    public String toString() {
        return "Mascota{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", especie='" + especie + '\'' +
                '}';
    }
}
