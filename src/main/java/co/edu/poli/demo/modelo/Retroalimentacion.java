package co.edu.poli.demo.modelo;


/**
 * 
 */
public class Retroalimentacion {

    // Atributos
    private int id;
    private double calificacion;
    private Reserva reserva;
    private String comentario;

    /**
     * Constructor con parámetros para inicializar los atributos
     */
    public Retroalimentacion(int id, double calificacion, Reserva reserva, String comentario) {
        this.id = id;
        this.calificacion = calificacion;
        this.reserva = reserva;
        this.comentario = comentario;
    }

    /**
     * Método getter para id
     */
    public int getId() {
        return id;
    }

    /**
     * Método setter para id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Método getter para calificacion
     */
    public double getCalificacion() {
        return calificacion;
    }

    /**
     * Método setter para calificacion
     */
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * Método getter para reserva
     */
    public Reserva getReserva() {
        return reserva;
    }

    /**
     * Método setter para reserva
     */
    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    /**
     * Método getter para comentario
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * Método setter para comentario
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    /**
     * Método toString que devuelve una representación en cadena del objeto Retroalimentacion
     */
    @Override
    public String toString() {
        return "Retroalimentacion{" +
               "id=" + id +
               ", calificacion=" + calificacion +
               ", reserva=" + reserva +
               ", comentario='" + comentario + '\'' +
               '}';
    }
}
