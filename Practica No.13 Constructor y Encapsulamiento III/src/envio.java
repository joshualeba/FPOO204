import javax.swing.JOptionPane;

public class envio {
    // Atributos privados
    private String codigoEnvio;
    private String destino;
    private double peso;

    // Constructor sobrecargado
    // 1. Constructor con código y destino
    public envio(String codigoEnvio, String destino) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.peso = 0.0; // Peso por defecto
    }

    // 2. Constructor con código, destino y peso
    public envio(String codigoEnvio, String destino, double peso) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.peso = peso;
    }

    // Métodos getter y setter para el peso
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Métodos getter para código y destino (no hay setters porque no se pueden modificar)
    public String getCodigoEnvio() {
        return codigoEnvio;
    }

    public String getDestino() {
        return destino;
    }

    // Metodo estático para crear un envío
    public static envio crearEnvio() {
        // Solicitar datos al usuario usando JOptionPane
        String codigo = JOptionPane.showInputDialog("Ingrese el código del envío:");
        String destino = JOptionPane.showInputDialog("Ingrese el destino del envío:");
        String pesoStr = JOptionPane.showInputDialog("Ingrese el peso del envío (opcional):");

        // Validar que se ingresaron código y destino
        if (codigo == null || codigo.isEmpty() || destino == null || destino.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Código y destino son obligatorios. No se pudo crear el envío.");
            return null; // Si no se ingresan código o destino, devolver null
        }

        // Si no se ingresa peso, crear envío sin peso
        if (pesoStr == null || pesoStr.isEmpty()) {
            return new envio(codigo, destino);
        } else {
            try {
                // Convertir el peso a double
                double peso = Double.parseDouble(pesoStr);
                return new envio(codigo, destino, peso);
            } catch (NumberFormatException e) {
                // Si el peso no es válido, mostrar mensaje y crear envío sin peso
                JOptionPane.showMessageDialog(null, "Peso no válido. Se creará el envío sin peso.");
                return new envio(codigo, destino);
            }
        }
    }
}