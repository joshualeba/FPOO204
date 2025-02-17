import javax.swing.JOptionPane;
import java.util.*;

public class CajaPopular {
    public int numeroCuenta;
    public String titular;
    public double saldo;
    public List<String> cuentasExternas;
    public boolean cuentaEnLinea;

    public CajaPopular(int numeroCuenta, String titular, double saldo, boolean cuentaEnLinea) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
        this.cuentasExternas = new ArrayList<>();
        this.cuentaEnLinea = cuentaEnLinea;
    }

    public void consultarDatos() {
        StringBuilder datos = new StringBuilder();
        datos.append("Número de cuenta: ").append(numeroCuenta).append("\n");
        datos.append("Titular: ").append(titular).append("\n");
        datos.append("Saldo: ").append(saldo).append("\n");
        datos.append("Tipo de cuenta: ").append(cuentaEnLinea ? "En línea" : "Física").append("\n");
        datos.append("Cuentas externas: ");
        if (cuentasExternas.isEmpty()) {
            datos.append("Ninguna");
        } else {
            for (String cuenta : cuentasExternas) {
                datos.append(cuenta).append(", ");
            }
            datos.delete(datos.length() - 2, datos.length()); // Elimina la última coma y espacio
        }
        JOptionPane.showMessageDialog(null, datos.toString());
    }

    public void ingresarEfectivo(double monto) {
        saldo += monto;
        JOptionPane.showMessageDialog(null, "Monto ingresado: " + monto + "\nNuevo saldo: " + saldo);
    }

    public void retirarEfectivo(double monto) {
        if (monto > saldo) {
            JOptionPane.showMessageDialog(null, "Fondos insuficientes");
        } else {
            saldo -= monto;
            JOptionPane.showMessageDialog(null, "Monto retirado: " + monto + "\nNuevo saldo: " + saldo);
        }
    }

    public void depositarAOtraCuenta(double monto) {
        if (monto > saldo) {
            JOptionPane.showMessageDialog(null, "Fondos insuficientes");
        } else {
            String cuentaSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione la cuenta externa para transferir", "Transferencia",
                    JOptionPane.QUESTION_MESSAGE, null, cuentasExternas.toArray(), cuentasExternas.get(0));
            if (cuentaSeleccionada != null) {
                saldo -= monto;
                JOptionPane.showMessageDialog(null, "Monto transferido: " + monto + "\nA la cuenta: " + cuentaSeleccionada + "\nNuevo saldo: " + saldo);
            }
        }
    }

    public static void main(String[] args) {
        int numeroCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de cuenta:"));
        String titular = JOptionPane.showInputDialog("Ingrese el nombre del titular:");
        double saldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el saldo inicial:"));

        int tipoCuenta = JOptionPane.showOptionDialog(null, "Seleccione el tipo de cuenta", "Tipo de cuenta",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                new String[]{"En línea", "Física"}, "En línea");

        boolean cuentaEnLinea = (tipoCuenta == 0);

        CajaPopular cuenta = new CajaPopular(numeroCuenta, titular, saldo, cuentaEnLinea);

        while (true) {
            String cuentaExterna = JOptionPane.showInputDialog("Ingrese una cuenta externa (o deje vacío para terminar):");
            if (cuentaExterna == null || cuentaExterna.trim().isEmpty()) {
                break;
            }
            cuenta.cuentasExternas.add(cuentaExterna);
        }

        while (true) {
            String[] opciones = {"Consultar datos", "Ingresar efectivo", "Retirar efectivo", "Depositar a otra cuenta", "Salir"};
            int seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Administración de cuenta",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (seleccion) {
                case 0:
                    cuenta.consultarDatos();
                    break;
                case 1:
                    double montoIngresar = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a depositar:"));
                    cuenta.ingresarEfectivo(montoIngresar);
                    break;
                case 2:
                    double montoRetirar = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a retirar:"));
                    cuenta.retirarEfectivo(montoRetirar);
                    break;
                case 3:
                    double montoTransferir = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a transferir:"));
                    cuenta.depositarAOtraCuenta(montoTransferir);
                    break;
                case 4:
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        }
    }
}