package co.edu.poli.demo.controlador;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;

import co.edu.poli.demo.modelo.ClienteFree;
import co.edu.poli.demo.modelo.ClienteGold;
import co.edu.poli.demo.modelo.Espacio;
import co.edu.poli.demo.modelo.Mascota;
import co.edu.poli.demo.modelo.Reserva;
import co.edu.poli.demo.modelo.Ubicacion;
import co.edu.poli.demo.modelo.Usuario;
import co.edu.poli.demo.servicios.ImplementacionOperaciones;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public class FormularioControlador {

    // Crear ubicaciones
    Ubicacion ubi1 = new Ubicacion("U01", 4.45, 74.55);
    Ubicacion ubi2 = new Ubicacion("U02", 5.60, 73.20);
    Ubicacion ubi3 = new Ubicacion("U03", 3.75, 72.10);
// Crear mascotas
Mascota mas1 = new Mascota("M01", "Pedro", 4, "Perro");
Mascota mas2 = new Mascota("M02", "Luna", 2, "Gato");
Mascota mas3 = new Mascota("M03", "Max", 3, "Conejo");
Mascota mas4 = new Mascota("M04", "Bella", 5, "Ave");

Mascota[] mascotas1 = {mas1};
Mascota[] mascotas2 = {mas3};
Mascota[] mascotas3 = {mas2};
Mascota[] mascotas4 = {mas4};
// Crear espacios
Espacio esp1 = new Espacio("E01", "Usme", 20, true, ubi1);
Espacio esp2 = new Espacio("E02", "Chapinero", 15, false, ubi2);
Espacio esp3 = new Espacio("E03", "Suba", 25, true, ubi3);

Espacio[] espacios = {esp1, esp2, esp3};

// Crear usuarios
ClienteFree F1 = new ClienteFree(
    112, 1, "U001", "Daniel Pinzon", "defaultPass123", "DaniPinzon@ejemplo.com",
    "01/01/2024", "3001234567", 20, "Masculino", mascotas1, "Planta", ubi1
);

ClienteGold G1 = new ClienteGold(
    true, 12, 1200, "U002", "Laura Gomez", "securePass456", "LauraG@ejemplo.com",
    "12/12/2023", "3109876543", 25, "Femenino", mascotas2, "Dorada", ubi2
);
// Crear más clientes
ClienteFree F2 = new ClienteFree(
    113, 2, "U003", "Carlos Martinez", "passCarlos789", "CarlosM@ejemplo.com",
    "15/02/2024", "3012345678", 30, "Masculino", mascotas3, "Cactus", ubi3
);

ClienteGold G2 = new ClienteGold(
    false, 6, 600, "U004", "Sofia Ramirez", "sofiaRpass987", "SofiaR@ejemplo.com",
    "10/11/2023", "3119876543", 28, "Femenino", mascotas4, "Orquídea", ubi1
);


Usuario[] usuarios = {F1, G1, F2, G2};

// Variable para almacenar el mes actual

private int mesActual = 0;
//Fecha de la reserva
    private Set<LocalDate> fechasReservadas = new HashSet<>();


    // Crear listas observables
    ObservableList<String> listaUsuariosIds = crearListaIdsUsuarios(usuarios);
    ObservableList<String> listaEspaciosIds = crearListaIdsEspacios(espacios);

    ObservableList<Reserva> reser;

    String path = " "; // Ruta del archivo
    String file = "TextNoBinary.txt"; // Nombre del archivo
    ImplementacionOperaciones op = new ImplementacionOperaciones();

    @FXML
    private ColumnConstraints Domingo;
    @FXML
    private ColumnConstraints Jueves;

    @FXML
    private ColumnConstraints Lunes;

    @FXML
    private ColumnConstraints Martes;
    @FXML
    private ColumnConstraints Miercoles;
    @FXML
    private ColumnConstraints Sabado;
    @FXML
    private RowConstraints Semana1;

    @FXML
    private RowConstraints Semana2;

    @FXML
    private RowConstraints Semana3;

    @FXML
    private RowConstraints Semana4;

    @FXML
    private RowConstraints Semana5;

    @FXML
    private ColumnConstraints Viernes;
    
    @FXML
    private RowConstraints NombreDia;

    @FXML
    private TableColumn<Reserva, String> Fecha;

    @FXML
    private DatePicker FechaReserva;

    @FXML
    private GridPane GridHora;

    @FXML
    private TableColumn<Reserva, String> ID_Reserva;

    @FXML
    private ImageView ImaElimini;

    @FXML
    private ImageView ImagReserva;

    @FXML
    private ImageView ImgAgregar;

    @FXML
    private ImageView ImgConfi;

    @FXML
    private ImageView ImgCrear;

    @FXML
    private ImageView ImgEstadis;

    @FXML
    private ImageView ImgFDerecha;

    @FXML
    private ImageView ImgFIzquier;

    @FXML
    private ImageView ImgMapa;

    @FXML
    private ImageView ImgMasco;

    @FXML
    private ImageView ImgPerfil;

    @FXML
    private ImageView ImgReloj;

    @FXML
    private ImageView ImgUbicacion;

    @FXML
    private TableColumn<Reserva, String> Mascota;

    @FXML
    private Label Nombre;

    @FXML
    private Label lblInforma;

    @FXML
    private TableColumn<Reserva, String> NombreUsuario;

    @FXML
    private TableColumn<Reserva, String> Sede;

    @FXML
    private TableView<Reserva> TableReserva;

    @FXML
    private Button bttAm;

    @FXML
    private Button bttAnterior;

    @FXML
    private Button bttCancelar;

    @FXML
    private Button bttCrear;

    @FXML
    private Button bttImprimir;

    @FXML
    private Button bttPm;

    @FXML
    private Button bttSiguiente;

    @FXML
    private ComboBox<String> cmbEspacio;

    @FXML
    private ComboBox<String> cmbIdUsuario;


    @FXML
    private GridPane gridCalendario;

    @FXML
    private Label lblAgre_Elimi;

    @FXML
    private Label lblConfigura;

    @FXML
    private Label lblEstadis;

    @FXML
    private TextField txtMes;

    @FXML
    private Label lblMascota;

    @FXML
    private Label lblNombreSede;

    @FXML
    private Label lblReserva;

    @FXML
    private Label lblSeleccion;

    @FXML
    private Label lblSeleccionSede;

    @FXML
    private TextField txtID_Reserva;

    @FXML
    private Button bttDeserializar;

    @FXML
    private Button bttSerializar;

    @FXML
    private RowConstraints Minuto2;

    @FXML
    private RowConstraints Minuto3;

    @FXML
    private RowConstraints Minuto4;

    @FXML
    private RowConstraints Minuto5;
    
    @FXML
    private ColumnConstraints Hora1;

    @FXML
    private ColumnConstraints Hora2;

    @FXML
    private ColumnConstraints Hora3;

    @FXML
    private ColumnConstraints Hora4;

    @FXML
    private ColumnConstraints Hora5;
    @FXML
    private RowConstraints Titulo;
    
    @FXML
    private Button bttModificar;
    @FXML
    private Label lblHorario;
    
    @FXML
    void pressCrear(ActionEvent event) {
        Alert alert = new Alert(AlertType.CONFIRMATION);

        try {
            // Obtener datos del formulario
            String id = txtID_Reserva.getText();
            String fechaReserva = (FechaReserva.getValue() != null) ? FechaReserva.getValue().toString() : null;
            String selectedEspacioId = cmbEspacio.getSelectionModel().getSelectedItem();
            String selectedUsuarioId = cmbIdUsuario.getSelectionModel().getSelectedItem();

            // Buscar objetos asociados
            Espacio espacio = buscarEspacioPorId(selectedEspacioId);
            Usuario usuario = buscarUsuarioPorId(selectedUsuarioId);

            if (espacio != null && usuario != null) {
                // Crear y guardar reserva
                Reserva registroReserva = new Reserva(id, fechaReserva, espacio, usuario);
                op.create(registroReserva);
                // Agregar la fecha de la reserva al conjunto de fechas reservadas
                LocalDate fecha = LocalDate.parse(fechaReserva);
                fechasReservadas.add(fecha);
                reser.add(registroReserva);
                loadTable();
                cargarCalendario(mesActual); 
                alert.setContentText("Reserva creada correctamente.");
            } else {
                alert.setContentText("Faltan datos para crear la reserva.");
            }
        } catch (Exception e) {
            alert.setContentText("Error al intentar crear una reserva: " + e.getMessage());
        }

        alert.showAndWait();
    }

    @FXML
void pressCancelar(ActionEvent event) {
    Alert alert = new Alert(Alert.AlertType.INFORMATION);

    try {
        // Obtener la reserva seleccionada de la tabla
        Reserva seleccionada = TableReserva.getSelectionModel().getSelectedItem();

        if (seleccionada != null) {
            // Eliminar la reserva seleccionada de la lista observable
            reser.remove(seleccionada);
             // Eliminar la fecha de la reserva del conjunto de fechas reservadas
             LocalDate fecha = LocalDate.parse(seleccionada.getFechaReserva());
             fechasReservadas.remove(fecha);  // Elimina la fecha reservada

            // Eliminar la reserva del archivo mediante el método delete de op
            Reserva eliminado = op.delete(seleccionada.getId());
            if (eliminado == null) {
                alert.setContentText("Error al intentar eliminar la reserva del archivo." );
            } else {
                alert.setContentText("Reserva eliminada correctamente."+eliminado);
            }

            // Actualizar la tabla
            loadTable();
            // Recargar el calendario para actualizar las marcas
            cargarCalendario(mesActual);
        } else {
            alert.setContentText("Por favor, seleccione un registro para eliminar.");
        }
    } catch (Exception e) {
        alert.setContentText("Error al intentar eliminar la reserva: " + e.getMessage());
    }

    alert.showAndWait();
}

@FXML
void pressImprimirReserva(ActionEvent event) {
    Alert alert = new Alert(Alert.AlertType.INFORMATION);

    try {
        // Obtener la reserva seleccionada de la tabla
        Reserva seleccionada = TableReserva.getSelectionModel().getSelectedItem();

        if (seleccionada != null) {
            // Leer la información de la reserva seleccionada utilizando el método read
            Reserva detallesReserva = op.read(seleccionada.getId());

            // Mostrar la información de la reserva en el cuadro de diálogo
            alert.setContentText("Detalles de la Reserva:\n" + detallesReserva);
        } else {
            // Si no hay ninguna reserva seleccionada
            alert.setContentText("Por favor, seleccione una reserva para imprimir.");
        }
    } catch (Exception e) {
        // Manejo de excepciones
        alert.setContentText("Error al intentar imprimir la reserva: " + e.getMessage());
    }

    alert.showAndWait();
}
@FXML
void pressSerializar(ActionEvent event) {
    Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
    try {
        // Serializar todas las reservas usando el método de la clase `ImplementacionOperaciones`
        alert1.setContentText(op.serializar(op.readAll(), path, file)+ "Serialización exitosa: " );
    } catch (Exception e) {
        // Manejo de excepciones
        alert1.setContentText("Error durante la serialización: " + e.getMessage());
    }
    alert1.show();
}
@FXML
void pressDeserializar(ActionEvent event) {
    Alert alert2 = new Alert(Alert.AlertType.CONFIRMATION);
    try {
        // Deserializar y establecer las reservas en el objeto 'op'
        op.setReservas(op.deserializar(path, file));
        
        // Limpiar la lista observable y agregar las reservas deserializadas
        reser.clear();
        fechasReservadas.clear();  // Limpiar las fechas reservadas previas

        for (Reserva reservas : op.readAll()) {
            if (reservas != null) {
                LocalDate fechaReserva = LocalDate.parse(reservas.getFechaReserva());
                fechasReservadas.add(fechaReserva);
                reser.add(reservas);
            }
        }

        // Cargar la tabla con los datos actualizados
        loadTable();
         // Recargar el calendario con las fechas deserializadas
         cargarCalendario(mesActual);

        // Mostrar mensaje de éxito
        alert2.setContentText("Archivo deserializado y reservas cargadas exitosamente.");
    } catch (Exception e) {
        // Manejo de excepciones
        alert2.setAlertType(Alert.AlertType.ERROR); // Cambiar a tipo ERROR
        alert2.setContentText("Error al abrir el archivo: " + e.getMessage());
    }

    alert2.showAndWait(); // Mostrar el cuadro de alerta
}

@FXML
void pressSiguiente(ActionEvent event) {
    // Incrementamos el contador de mes
    mesActual++;
    
    // Llamamos al método cargarCalendario con el nuevo valor de mesActual
    cargarCalendario(mesActual);
}
@FXML
void pressAnterior(ActionEvent event) {
    mesActual--;
    
    // Llamamos al método cargarCalendario con el nuevo valor de mesActual
    cargarCalendario(mesActual);
}
@FXML
void pressPm(ActionEvent event) {
    cargarHoras("Pm");
}
@FXML
void pressAm(ActionEvent event) {
    cargarHoras("Am");
}

@FXML
void pressModifcar(ActionEvent event) {
    // Crear una alerta para mostrar mensajes al usuario
    Alert alert3 = new Alert(AlertType.CONFIRMATION);

    try {
        // Obtener la reserva seleccionada en la tabla
        Reserva reservaSeleccionada = TableReserva.getSelectionModel().getSelectedItem();
       
        
        // Verificar que hay una reserva seleccionada
        if (reservaSeleccionada == null) {
            alert3.setAlertType(AlertType.WARNING);
            alert3.setContentText("Por favor, selecciona un registro para modificar.");
            alert3.show();
            return;
        }
       
        String idReserva = reservaSeleccionada.getId(); // Mantener el ID original
        String fechaReserva = (FechaReserva.getValue() != null) ? FechaReserva.getValue().toString() : null;
        String selectedEspacioId = cmbEspacio.getSelectionModel().getSelectedItem();
        String selectedUsuarioId = cmbIdUsuario.getSelectionModel().getSelectedItem();

        // Buscar los objetos relacionados por sus IDs
        Espacio espacio = buscarEspacioPorId(selectedEspacioId);
        Usuario usuario = buscarUsuarioPorId(selectedUsuarioId);

        // Validar que los objetos relacionados no sean nulos
        if (espacio == null || usuario == null) {
            alert3.setAlertType(AlertType.ERROR);
            alert3.setContentText("Espacio o usuario no encontrados. Verifica los datos seleccionados.");
            alert3.show();
            return;
        }

        // Crear el nuevo objeto Reserva actualizado
        Reserva nuevaReserva = new Reserva(idReserva, fechaReserva, espacio, usuario);

        // Actualizar la reserva
        String resultado = op.update(nuevaReserva, idReserva); // Método de actualización en tu clase de operaciones
        LocalDate fecha = LocalDate.parse(fechaReserva);
                fechasReservadas.add(fecha);
                reser.remove(reservaSeleccionada);
                reser.add(nuevaReserva);
        alert3.setContentText(resultado);
        loadTable();
        cargarCalendario(mesActual); 


    } catch (Exception e) {
        // Mostrar mensaje en caso de error
        alert3.setAlertType(AlertType.ERROR);
        alert3.setContentText("Error al intentar modificar el registro: " + e.getMessage());
    }

    // Mostrar la alerta
    alert3.show();
}

    @FXML
    void initialize() {
        reser = FXCollections.observableArrayList();
        cmbIdUsuario.setItems(listaUsuariosIds);
        cmbEspacio.setItems(listaEspaciosIds);
        loadTable();
        cargarCalendario(mesActual);
        cargarHoras("Am");
        TableReserva.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) { // Verifica que haya un elemento seleccionado
                txtID_Reserva.setText(newValue.getId().toString()); // Actualiza el campo con el ID de la reserva seleccionada
            }
        });
    }

    void loadTable() {
        ID_Reserva.setCellValueFactory(cell -> new SimpleStringProperty(cell.getValue().getId()));
        Fecha.setCellValueFactory(cell -> {
            String formattedDate = LocalDate.parse(cell.getValue().getFechaReserva())
                                         .format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            return new SimpleStringProperty(formattedDate);
        });
        Sede.setCellValueFactory(cell -> new SimpleStringProperty(cell.getValue().getEspacio().getNombre()));
        Mascota.setCellValueFactory(cell -> {
            Usuario usuario = cell.getValue().getUsuario();
            return new SimpleStringProperty(obtenerNombresMascotas(usuario));
        });        
        NombreUsuario.setCellValueFactory(cell -> new SimpleStringProperty(cell.getValue().getUsuario().getNombre()));

        TableReserva.setItems(reser);
    }

    // Métodos auxiliares para buscar objetos
    private Espacio buscarEspacioPorId(String id) {
        for (Espacio e : espacios) {
            if (e.getId().equals(id)) {
                return e;
            }
        }
        return null;
    }

    private Usuario buscarUsuarioPorId(String id) {
        for (Usuario u : usuarios) {
            if (u.getId().equals(id)) {
                return u;
            }
        }
        return null;
    }


    private ObservableList<String> crearListaIdsUsuarios(Usuario[] usuarios) {
        ObservableList<String> listaIds = FXCollections.observableArrayList();
        for (Usuario usuario : usuarios) {
            if (usuario != null) {
                listaIds.add(usuario.getId());
            }
        }
        return listaIds;
    }

    private ObservableList<String> crearListaIdsEspacios(Espacio[] espacios) {
        ObservableList<String> listaIds = FXCollections.observableArrayList();
        for (Espacio espacio : espacios) {
            if (espacio != null) {
                listaIds.add(espacio.getId());
            }

        } 
        return listaIds;
    }
   private String obtenerNombresMascotas(Usuario usuario) {
    if (usuario != null && usuario.getMascotas() != null && usuario.getMascotas().length > 0) {
        StringBuilder nombres = new StringBuilder();
        for (Mascota mascota : usuario.getMascotas()) {
            if (nombres.length() > 0) {
                nombres.append(", ");
            }
            nombres.append(mascota.getNombre());
        }
        return nombres.toString();
    }
    // Si el usuario no tiene mascotas, devolver un mensaje predeterminado
    return "Sin mascotas";
}


private void cargarCalendario(int cambioMes) {
    // Obtenemos la fecha actual
    LocalDate fechaActual = LocalDate.now();
    
    // Modificamos la fecha según el cambio de mes
    fechaActual = fechaActual.plusMonths(cambioMes);  // Si cambioMes es 1, se muestra el siguiente mes; si es -1, el anterior.
    
    // Obtener el primer día del mes
    LocalDate primerDiaDelMes = fechaActual.withDayOfMonth(1);
    
    // Obtener el día de la semana del primer día del mes (Lunes = 1, Domingo = 7)
    int diaDeLaSemana = primerDiaDelMes.getDayOfWeek().getValue();
    
    // Número de días en el mes
    int diasEnElMes = fechaActual.lengthOfMonth();
    
    // Limpiar el GridPane antes de agregar los nuevos días
    gridCalendario.getChildren().clear();
    
    // Agregar el nombre del mes al control txtMes (suponiendo que txtMes es un Label o TextField)
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM yyyy");
    String nombreMes = fechaActual.format(formatter);  // Obtiene el nombre completo del mes y el año
    txtMes.setText(nombreMes);  // Establece el texto del Label o TextField con el nombre del mes
    
    // Agregar los nombres de los días de la semana en la primera fila
    String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
    
    // Llenar la primera fila con los días de la semana
    for (int columna = 0; columna < 7; columna++) {
        Label labelDiaSemana = new Label(diasSemana[columna]);
        labelDiaSemana.setStyle("-fx-alignment: center; -fx-font-size: 14px; -fx-font-weight: bold; -fx-padding: 5px;");
        gridCalendario.add(labelDiaSemana, columna, 0);  // Primera fila (índice 0)
    }
    
    // Agregar los días del mes al GridPane
    int diaContador = 1;
    
    // Llenamos las celdas con los días
    for (int fila = 1; fila < 6; fila++) {  // Empezamos en la fila 1 porque la fila 0 ya tiene los días de la semana
        for (int columna = 0; columna < 7; columna++) {
            // Si estamos antes del primer día, no ponemos nada
            if (fila == 1 && columna < diaDeLaSemana - 1) {
                continue;
            }
    
            // Si aún hay días del mes por mostrar
            if (diaContador <= diasEnElMes) {
                // Crear un Label con el número del día
                Label labelDia = new Label(String.valueOf(diaContador));
                
                // Verificar si la fecha está reservada y cambiar el color
                LocalDate fechaDia = LocalDate.of(fechaActual.getYear(), fechaActual.getMonth(), diaContador);
                if (fechasReservadas.contains(fechaDia)) {
                    labelDia.setStyle("-fx-alignment: center; -fx-font-size: 16px; -fx-padding: 5px; -fx-background-color: red; -fx-text-fill: white;");
                } else {
                    labelDia.setStyle("-fx-alignment: center; -fx-font-size: 16px; -fx-padding: 5px;");
                }
    
                // Agregar el Label al GridPane en la celda correspondiente
                gridCalendario.add(labelDia, columna, fila);
    
                diaContador++;
            }
        }
    }
}
private void cargarHoras(String Hora) {
    GridHora.getChildren().clear();

    // Definimos las horas según AM o PM
    String[] horas;
    if (Hora.equals("Am")) {
        horas = new String[]{"08", "09", "10", "11", "12"}; // Horas AM
    } else {
        horas = new String[]{"14", "15", "16", "17", "18"}; // Horas PM
    }

    // Llenar la primera fila con las horas
    for (int i = 0; i < horas.length; i++) {
        Label label = new Label(horas[i]);
        GridHora.add(label, i, 0); // Primera fila
    }

    // Llenar la segunda fila con las horas completas (hora:00)
    for (int i = 0; i < horas.length; i++) {
        Label label = new Label(horas[i] + ":00");
        GridHora.add(label, i, 1); // Segunda fila
    }

    // Llenar las siguientes filas con intervalos de 15 minutos (hora:15, hora:30, hora:45)
    String[] minutos = {":15", ":30", ":45"};
    for (int i = 0; i < horas.length; i++) {
        for (int j = 0; j < minutos.length; j++) {
            Label label = new Label(horas[i] + minutos[j]);
            GridHora.add(label, i, j + 2); // A partir de la fila 3
        }
    }
}


}
   