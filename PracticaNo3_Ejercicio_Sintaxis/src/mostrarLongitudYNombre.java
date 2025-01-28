import java.util.*;

public class mostrarLongitudYNombre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;

        System.out.println("Ingresa tu nombre: ");
        nombre = sc.nextLine();

        int longitud = nombre.length();
        String nombreMay = nombre.toUpperCase();

        System.out.println(nombreMay + " tiene " + longitud + " caracteres.");
    }
}