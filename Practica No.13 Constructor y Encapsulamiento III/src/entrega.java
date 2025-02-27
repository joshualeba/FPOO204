import javax.swing.JOptionPane;

public class entrega {
    // Atributos privados
    private String numeroGuia;
    private String estado;

    // Constructor
    public entrega(String numeroGuia) {
        this.numeroGuia = numeroGuia;
        this.estado = "Pendiente"; // Estado por defecto
    }

    // Métodos getter
    public String getNumeroGuia() {
        return numeroGuia;
    }

    public String getEstado() {
        return estado;
    }

    // Metodo para actualizar el estado
    public void actualizarEstado(String nuevoEstado) {
        // Validar que el nuevo estado sea "En tránsito" o "Entregado"
        if (nuevoEstado.equalsIgnoreCase("En tránsito") || nuevoEstado.equalsIgnoreCase("Entregado")) {
            this.estado = nuevoEstado;
            JOptionPane.showMessageDialog(null, "Estado actualizado correctamente a: " + nuevoEstado);
        } else {
            JOptionPane.showMessageDialog(null, "Estado no válido. Solo se permite 'En tránsito' o 'Entregado'.");
        }
    }

    // Metodo para solicitar y actualizar el estado usando JOptionPane
    public void solicitarActualizacionEstado() {
        String nuevoEstado = JOptionPane.showInputDialog("Ingrese el nuevo estado (En tránsito/Entregado):");
        if (nuevoEstado != null) { // Si el usuario no cancela el diálogo
            actualizarEstado(nuevoEstado);
        } else {
            JOptionPane.showMessageDialog(null, "Actualización de estado cancelada.");
        }
    }
}