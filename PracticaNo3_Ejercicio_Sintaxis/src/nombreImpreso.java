import java.util.*;

public class nombreImpreso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreCompleto, nombre, apellido_p, apellido_m;

        System.out.println("Ingresa tu(s) nombre(s): ");
        nombreCompleto = sc.nextLine();
        System.out.println("Ingresa tu apellido paterno: ");
        apellido_p = sc.nextLine();
        System.out.println("Ingresa tu apellido materno: ");
        apellido_m = sc.nextLine();

        nombreCompleto = nombreCompleto + " " + apellido_p + " " + apellido_m;

        String nombreMay = nombreCompleto.toUpperCase();
        String nombreMin = nombreCompleto.toLowerCase();
        String nombreCap = nombreCompleto.toUpperCase();
        String APCap = apellido_p.toUpperCase();
        String AMCap = apellido_m.toUpperCase();
        String nombreCaps = nombreCap.substring(0,1);
        String APCaps = APCap.substring(0,1);
        String AMCaps = AMCap.substring(0,1);
        String CAPS = nombreCaps + APCaps + AMCaps;

        System.out.println("Nombre completo en mayúsculas: " + nombreMay);
        System.out.println("Nombre completo en minúsculas: " + nombreMin);
        System.out.println("Iniciales del nombre en mayúsculas: " + CAPS);
    }
}