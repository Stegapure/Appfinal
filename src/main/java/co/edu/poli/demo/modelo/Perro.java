package co.edu.poli.demo.modelo;

/**
 * 
 */
public class Perro extends Mascota  {

    // Atributo específico de Perro
    private String raza;

    public Perro(String raza, String id, String nombre, int edad, String especie) {
        super(id, nombre, edad, especie);
        this.raza = raza;
    }

    /**
     * Constructor con parámetros para inicializar los atributos heredados y la raza
     */
 

    /**
     * Método getter para raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * Método setter para raza
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * Método que devuelve el sonido que hace el perro
     */
    @Override
    public String hacerSonido() {
        // Retorna un sonido típico de perro
        return "Guau";
    }

    /**
     * Método que simula el paseo del perro
     */
    public String pasear() {
        // Simula el paseo del perro
        return "El perro está paseando";
    }

    /**
     * Método toString que devuelve una representación en cadena del objeto Perro
     */
    @Override
    public String toString() {
        return "Perro{" +
               "raza='" + raza + '\'' + ", "+ super.toString() +
               '}';
    }

}
