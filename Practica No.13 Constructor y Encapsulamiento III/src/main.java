import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {
        // Variables para almacenar los objetos creados
        vehiculo vehiculo = null;
        conductor conductor = null;
        envio envio = null;
        entrega entrega = null;

        // Menú principal
        while (true) {
            String opcion = JOptionPane.showInputDialog(
                    "Seleccione una opción:\n" +
                            "1. Crear vehículo\n" +
                            "2. Asignar conductor a vehículo\n" +
                            "3. Crear envío\n" +
                            "4. Crear entrega\n" +
                            "5. Actualizar estado de entrega\n" +
                            "6. Salir"
            );

            if (opcion == null || opcion.equals("6")) {
                JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                break; // Salir del bucle y terminar el programa
            }

            switch (opcion) {
                case "1": // Crear vehículo
                    String placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo:");
                    String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
                    String capacidadCargaStr = JOptionPane.showInputDialog("Ingrese la capacidad de carga del vehículo:");
                    double capacidadCarga = Double.parseDouble(capacidadCargaStr);
                    vehiculo = new vehiculo(placa, modelo, capacidadCarga);
                    JOptionPane.showMessageDialog(null, "Vehículo creado correctamente.");
                    break;

                case "2": // Asignar conductor a vehículo
                    if (vehiculo == null) {
                        JOptionPane.showMessageDialog(null, "Primero debe crear un vehículo.");
                        break;
                    }
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del conductor:");
                    String identificacion = JOptionPane.showInputDialog("Ingrese la identificación del conductor:");
                    String licencia = JOptionPane.showInputDialog("Ingrese la licencia del conductor:");
                    conductor = new conductor(nombre, identificacion, licencia);
                    vehiculo.asignarConductor(conductor);
                    break;

                case "3": // Crear envío
                    envio = envio.crearEnvio();
                    if (envio != null) {
                        JOptionPane.showMessageDialog(null, "Envío creado correctamente.");
                    }
                    break;

                case "4": // Crear entrega
                    String numeroGuia = JOptionPane.showInputDialog("Ingrese el número de guía de la entrega:");
                    entrega = new entrega(numeroGuia);
                    JOptionPane.showMessageDialog(null, "Entrega creada correctamente.");
                    break;

                case "5": // Actualizar estado de entrega
                    if (entrega == null) {
                        JOptionPane.showMessageDialog(null, "Primero debe crear una entrega.");
                        break;
                    }
                    entrega.solicitarActualizacionEstado();
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente nuevamente.");
                    break;
            }
        }
    }
}