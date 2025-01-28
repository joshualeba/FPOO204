import java.util.*;

public class validacionContrasena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contrasena = "passwordpai";
        System.out.println("Ingresa tu contraseña: ");
        String contrasenaIngresada = sc.nextLine();

        if(contrasenaIngresada.equalsIgnoreCase(contrasena)){
            System.out.println("La contraseña introducida es igual a la predeterminada. Puedes ingresar.");
        } else {
            System.out.println("Acceso denegado.");
        }
    }
}