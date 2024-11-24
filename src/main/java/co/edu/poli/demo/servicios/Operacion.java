package co.edu.poli.demo.servicios;
import co.edu.poli.demo.modelo.Reserva;

public interface Operacion {

    public String create (Reserva x);
    public Reserva read (String id);
    public Reserva [] readAll ();
    public String update (Reserva x, String id);
    public Reserva delete (String id);
    public String serializar (Reserva [] usuarios, String path, String name);
    public Reserva [] deserializar (String path, String name);

}
