package co.edu.poli.demo.modelo;

import java.io.Serializable;

/**
 * Clase ClienteFree que extiende Usuario.
 */
public class ClienteFree extends Usuario implements Serializable {

     /**
     * Días de acceso limitado.
     */
    private int diasAccesoLimitado;
    /**
     * Límite de reservas permitidas.
     */
    private int limiteReservas;

   

    public ClienteFree(int diasAccesoLimitado, int limiteReservas, String id, String nombre, String contrasenia, String email, String fechaRegistro, String numContacto, int edad, String genero, Mascota[] mascotas, String membresia, Ubicacion ubicacion) {
        super(id, nombre, contrasenia, email, fechaRegistro, numContacto, edad, genero, mascotas, membresia, ubicacion);
        this.diasAccesoLimitado = diasAccesoLimitado;
        this.limiteReservas = limiteReservas;
    }

    
    /**
     * Método para calcular las reservas disponibles.
     * 
     * @return Número de reservas disponibles.
     */
    public int calcularReservasDisponibles() {
        // Implementación simulada para ejemplo.
        return limiteReservas; // Asume que todas las reservas están disponibles inicialmente.
    }

    /**
     * Método para calcular el saldo a pagar por una reserva.
     * 
     * @param reserva Número de reserva.
     * @return Saldo a pagar.
     */
    @Override
    public double calcularSaldoPagar(int reserva) {
        // Implementación simulada para ejemplo.
        return 0.0d; // Clientes free no pagan saldo.
    }

    /**
     * Obtiene el límite de reservas.
     * 
     * @return Límite de reservas.
     */
    public int getLimiteReservas() {
        return limiteReservas;
    }

    /**
     * Establece el límite de reservas.
     * 
     * @param limiteReservas Nuevo límite de reservas.
     */
    public void setLimiteReservas(int limiteReservas) {
        this.limiteReservas = limiteReservas;
    }

    /**
     * Obtiene los días de acceso limitado.
     * 
     * @return Días de acceso limitado.
     */
    public int getDiasAccesoLimitado() {
        return diasAccesoLimitado;
    }

    /**
     * Establece los días de acceso limitado.
     * 
     * @param diasAccesoLimitado Nuevos días de acceso limitado.
     */
    public void setDiasAccesoLimitado(int diasAccesoLimitado) {
        this.diasAccesoLimitado = diasAccesoLimitado;
    }

    @Override
public String toString() {
    return "ClienteFree{"+ "limiteReservas=" + limiteReservas +
            ", diasAccesoLimitado=" + diasAccesoLimitado + super.toString() +
            '}';
}

}