package co.edu.poli.demo.servicios;

import java.io.*;
import java.util.Arrays;

import co.edu.poli.demo.modelo.Reserva;

public class ImplementacionOperaciones implements Operacion {

    private Reserva[] Reservas;

    public ImplementacionOperaciones() {
        Reservas = new Reserva[5];
    }

    public ImplementacionOperaciones(Reserva[] Reservas) {
        this.Reservas = Reservas;
    }

    @Override
    public String create(Reserva x) {
        // Buscar el primer null y agregar el objeto
        for (int i = 0; i < Reservas.length; i++) {
            if (Reservas[i] == null) {
                Reservas[i] = x;
                return "Reserva agregada en la posición " + i;
            }
        }
        // Si no hay espacio, duplicamos el tamaño del arreglo
        Reservas = Arrays.copyOf(Reservas, Reservas.length * 2);
        Reservas[Reservas.length / 2] = x; // Se divide para encontrar la mitad que es el nuevo espacio libre
        return "Reserva agregada en la posición " + (Reservas.length / 2);
    }

    @Override
    public Reserva read(String id) {
        // Buscar la reserva por ID
        for (Reserva reserva : Reservas) {
            if (reserva != null && reserva.getId() != null && reserva.getId().equals(id)) {
                return reserva; // Retornar el objeto si se encuentra
            }
        }
        return null; // Retornar null si no encuentra el objeto
    }
    
    

    @Override
    public Reserva[] readAll() {
        return Reservas;
    }

    @Override
    public String update(Reserva x, String id) {
        for (int i = 0; i < Reservas.length; i++) {
            Reserva reserva = Reservas[i];
            if (reserva != null && reserva.getId().equals(id)) {
                Reservas[i] = x; // Actualizamos el objeto en la posición correcta
                return "Actualización exitosa";
            }
        }
        return "No se encontró el objeto con el ID proporcionado";
    }

    @Override
    public Reserva delete(String id) {
        Reserva reservaEliminada = null;
        for (int i = 0; i < Reservas.length; i++) {
            if (Reservas[i] != null && Reservas[i].getId().equals(id)) {
                reservaEliminada = Reservas[i];
                Reservas[i] = null; // Elimina la reserva del arreglo
                return reservaEliminada; // Retorna la reserva eliminada
            }
        }
        return null; // Si no se encontró el objeto, retornamos null
    }

    // Método para serializar y guardar varias reservas en un archivo TXT
    @Override
    public String serializar(Reserva[] reservas, String path, String name) {
        try {
            FileOutputStream fos = new FileOutputStream(path + name);
            ObjectOutputStream oss = new ObjectOutputStream(fos);
            oss.writeObject(reservas);
            oss.close();
            fos.close();
            return "Archivo creado con éxito";
        } catch (IOException ioe) {
            return "Error al crear el archivo: " + ioe.getMessage();
        }
    }

    @Override
    public Reserva[] deserializar(String path, String name) {
        Reserva[] reservas = new Reserva[10]; // Asumiendo un tamaño inicial

        try {
            FileInputStream fis = new FileInputStream(path + name);
            ObjectInputStream ois = new ObjectInputStream(fis);

            reservas = (Reserva[]) ois.readObject(); // Deserializamos las reservas

            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return reservas;
    }

    public Reserva[] getReservas() {
        return Reservas;
    }

    public void setReservas(Reserva[] Reservas) {
        this.Reservas = Reservas;
    }
}
