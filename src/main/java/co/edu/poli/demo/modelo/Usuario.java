package co.edu.poli.demo.modelo;

import java.io.Serializable;
import java.util.Arrays;

/**
 * 
 */
public abstract class Usuario  implements Serializable {

    // Atributos
    private String id;
    private String nombre;
    private String contrasenia;
    private String email;
    private String fechaRegistro;
    private String numContacto;
    private int edad;
    private String genero;
    private Mascota[] mascotas;
    private String membresia;
    private Ubicacion ubicacion;

    /**
     * Constructor con parámetros para inicializar los atributos
     */
    public Usuario(String id, String nombre, String contrasenia, String email, String fechaRegistro, 
                   String numContacto, int edad, String genero, Mascota[] mascotas, String membresia, Ubicacion ubicacion) {
        this.id = id;
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.email = email;
        this.fechaRegistro = fechaRegistro;
        this.numContacto = numContacto;
        this.edad = edad;
        this.genero = genero;
        this.mascotas = mascotas;
        this.membresia = membresia;
        this.ubicacion = ubicacion;
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
     * Método getter para nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método setter para nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método getter para contrasenia
     */
    public String getContrasenia() {
        return contrasenia;
    }

    /**
     * Método setter para contrasenia
     */
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    /**
     * Método getter para email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Método setter para email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Método getter para fechaRegistro
     */
    public String getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * Método setter para fechaRegistro
     */
    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    /**
     * Método getter para numContacto
     */
    public String getNumContacto() {
        return numContacto;
    }

    /**
     * Método setter para numContacto
     */
    public void setNumContacto(String numContacto) {
        this.numContacto = numContacto;
    }

    /**
     * Método getter para edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método setter para edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Método getter para genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Método setter para genero
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Método getter para mascotas
     */
    public Mascota[] getMascotas() {
        return mascotas;
    }

    /**
     * Método setter para mascotas
     */
    public void setMascotas(Mascota[] mascotas) {
        this.mascotas = mascotas;
    }

    /**
     * Método getter para membresia
     */
    public String getMembresia() {
        return membresia;
    }

    /**
     * Método setter para membresia
     */
    public void setMembresia(String membresia) {
        this.membresia = membresia;
    }

    /**
     * Método getter para ubicacion
     */
    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    /**
     * Método setter para ubicacion
     */
    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * Método toString que devuelve una representación en cadena del objeto Usuario
     */
    @Override
    public String toString() {
        return "Usuario{" +
               "id='" + id + '\'' +
               ", nombre='" + nombre + '\'' +
               ", email='" + email + '\'' +
               ", fechaRegistro='" + fechaRegistro + '\'' +
               ", numContacto='" + numContacto + '\'' +
               ", edad=" + edad +
               ", genero='" + genero + '\'' +
               ", mascotas=" + Arrays.toString(mascotas) +
               ", membresia='" + membresia + '\'' +
               ", ubicacion=" + ubicacion +
               '}';
    }

    /**
     * Método abstracto para calcular el saldo a pagar
     */
    public abstract double calcularSaldoPagar(int reserva);
}
