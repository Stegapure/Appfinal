package co.edu.poli.demo.modelo;

import java.io.Serializable;

/**
 * 
 */
public class Reserva implements Serializable {

    // Atributos
    private String id;
    private String fechaReserva;
    private Espacio espacio;
    private Usuario usuario;

    /**
     * Constructor con parámetros para inicializar los atributos
     */
    public Reserva(String id, String fechaReserva, Espacio espacio, Usuario usuario) {
        this.id = id;
        this.fechaReserva = fechaReserva;
        this.espacio = espacio;
        this.usuario = usuario;
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
     * Método getter para fechaReserva
     */
    public String getFechaReserva() {
        return fechaReserva;
    }

    /**
     * Método setter para fechaReserva
     */
    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    /**
     * Método getter para espacio
     */
    public Espacio getEspacio() {
        return espacio;
    }

    /**
     * Método setter para espacio
     */
    public void setEspacio(Espacio espacio) {
        this.espacio = espacio;
    }

    /**
     * Método getter para usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Método setter para usuario
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * Método toString que devuelve una representación en cadena del objeto Reserva
     */
    @Override
    public String toString() {
        return "Reserva{" +
               "id=" + id +
               ", fechaReserva='" + fechaReserva + '\'' +
               ", espacio=" + espacio +
               ", usuario=" + usuario +
               '}';
    }
}
