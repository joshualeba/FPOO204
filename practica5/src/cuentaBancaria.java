import java.util.*;

public class cuentaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int saldo = 0;

        System.out.println("Escriba la bitácora de operaciones: \nEsribe D para depositar y a continuación la cantidad y da enter\nEscribe R para retirar y a continuación la cantidad y da enter\nSi ya no deseas realizar más movimientos, da enter para que se muestre el saldo final.");

        while (true) {
            String linea = sc.nextLine();
            if (linea.isEmpty()) {
                break;
            }

            if (linea.startsWith("D")) {
                saldo += Integer.parseInt(linea.substring(2));
            } else if (linea.startsWith("R")) {
                saldo -= Integer.parseInt(linea.substring(2));
            }
        }
        System.out.println("Bitácora finalizada, su saldo final es " + saldo);
    }
}