import javax.swing.JOptionPane;

public class Main {
    // Atributos encapsulados
    private int numeroCuenta;
    private String titular;
    private int edad;
    private double saldo;

    // Constructor
    public Main(int numeroCuenta, String titular, int edad, double saldo) {  // Cambia el nombre del constructor
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.edad = edad;
        this.saldo = saldo;
    }

    // Getters y Setters
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Métodos de la clase
    public void consultarSaldo() {
        JOptionPane.showMessageDialog(null, "Saldo actual: " + saldo);
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
            saldo -= monto;
            JOptionPane.showMessageDialog(null, "Monto transferido: " + monto + "\nNuevo saldo: " + saldo);
        }
    }

    public static void main(String[] args) {
        int numeroCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de cuenta:"));
        String titular = JOptionPane.showInputDialog("Ingrese el nombre del titular:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del titular:"));
        double saldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el saldo inicial:"));

        Main cuenta = new Main(numeroCuenta, titular, edad, saldo);  // Cambia el nombre de la clase aquí

        while (true) {
            String[] opciones = {"Consultar Saldo", "Ingresar Efectivo", "Retirar Efectivo", "Depositar a Otra Cuenta", "Salir"};
            int seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Administración de Cuenta",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (seleccion) {
                case 0:
                    cuenta.consultarSaldo();
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
                    JOptionPane.showMessageDialog(null, "Gracias por usar el sistema.");
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        }
    }
}