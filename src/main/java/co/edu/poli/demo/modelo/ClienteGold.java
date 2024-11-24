package co.edu.poli.demo.modelo;

import java.io.Serializable;

/**
 * Clase ClienteGold que extiende Usuario.
 */
public class ClienteGold extends Usuario implements Serializable {

    /**
     * Valor de la membresía.
     */
    private double valorMembresia;

    /**
     * Indica si tiene acceso VIP.
     */
    private boolean accesoVIP;

    /**
     * Descuento aplicable.
     */
    private double descuento;

    public ClienteGold(boolean accesoVIP, double descuento, double valorMembresia, String id, String nombre, String contrasenia, String email, String fechaRegistro, String numContacto, int edad, String genero, Mascota[] mascotas, String membresia, Ubicacion ubicacion) {
        super(id, nombre, contrasenia, email, fechaRegistro, numContacto, edad, genero, mascotas, membresia, ubicacion);
        this.accesoVIP = accesoVIP;
        this.descuento = descuento;
        this.valorMembresia = valorMembresia;
    }


    /**
     * Valida si el cliente tiene acceso VIP.
     * 
     * @return `true` si tiene acceso VIP, `false` de lo contrario.
     */
    public boolean validarAccesoVIP() {
        return accesoVIP;
    }

    /**
     * Calcula el saldo a pagar por una reserva, aplicando el descuento.
     * 
     * @param reserva Número de reserva.
     * @return Saldo a pagar.
     */
    @Override
    public double calcularSaldoPagar(int reserva) {
        // Implementación simulada para ejemplo.
        double costoBase = 100.0; // Supongamos un costo base por reserva.
        return costoBase * (1 - descuento);
    }

    /**
     * Obtiene el valor de la membresía.
     * 
     * @return Valor de la membresía.
     */
    public double getValorMembresia() {
        return valorMembresia;
    }

    /**
     * Establece el valor de la membresía.
     * 
     * @param valorMembresia Nuevo valor de la membresía.
     */
    public void setValorMembresia(double valorMembresia) {
        this.valorMembresia = valorMembresia;
    }

    /**
     * Indica si tiene acceso VIP.
     * 
     * @return `true` si tiene acceso VIP, `false` de lo contrario.
     */
    public boolean isAccesoVIP() {
        return accesoVIP;
    }

    /**
     * Establece si el cliente tiene acceso VIP.
     * 
     * @param accesoVIP Nuevo estado de acceso VIP.
     */
    public void setAccesoVIP(boolean accesoVIP) {
        this.accesoVIP = accesoVIP;
    }

    /**
     * Obtiene el descuento aplicable.
     * 
     * @return Descuento aplicable.
     */
    public double getDescuento() {
        return descuento;
    }

    /**
     * Establece el descuento aplicable.
     * 
     * @param descuento Nuevo descuento.
     */
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    /**
     * Representación en cadena de la clase ClienteGold.
     * 
     * @return Información del cliente gold como cadena.
     */
    @Override
    public String toString() {
        return "ClienteGold{" +
                "valorMembresia=" + valorMembresia +
                ", accesoVIP=" + accesoVIP +
                ", descuento=" + descuento + super.toString() +
                '}';
    }
}
