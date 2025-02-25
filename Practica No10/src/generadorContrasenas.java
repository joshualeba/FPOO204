import javax.swing.JOptionPane;
import java.util.Random;

public class generadorContrasenas {
    // Atributos encapsulados
    private static final String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    private static final String MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String ESPECIALES = "!@#$%^&*()_+";

    // Método principal
    public static void main(String[] args) {
        int longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud de la contraseña (8 por defecto):", "8"));
        boolean incluirMayusculas = JOptionPane.showConfirmDialog(null, "¿Incluir mayúsculas?", "Especificaciones", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        boolean incluirEspeciales = JOptionPane.showConfirmDialog(null, "¿Incluir caracteres especiales?", "Especificaciones", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;

        String contrasena = generarContrasena(longitud, incluirMayusculas, incluirEspeciales);
        JOptionPane.showMessageDialog(null, "Contraseña generada: " + contrasena);

        String fortaleza = comprobarFortalezaContrasena(contrasena);
        JOptionPane.showMessageDialog(null, "Fortaleza de la contraseña: " + fortaleza);
    }

    // Método para generar la contraseña
    private static String generarContrasena(int longitud, boolean incluirMayusculas, boolean incluirEspeciales) {
        StringBuilder caracteres = new StringBuilder(MINUSCULAS);
        if (incluirMayusculas) caracteres.append(MAYUSCULAS);
        if (incluirEspeciales) caracteres.append(ESPECIALES);

        Random random = new Random();
        StringBuilder contrasena = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(caracteres.length());
            contrasena.append(caracteres.charAt(indice));
        }

        return contrasena.toString();
    }

    // Método para comprobar la fortaleza de la contraseña
    private static String comprobarFortalezaContrasena(String contrasena) {
        if (contrasena.length() < 8) return "Débil";
        boolean tieneMayusculas = !contrasena.equals(contrasena.toLowerCase());
        boolean tieneEspeciales = contrasena.matches(".*[!@#$%^&*()_+].*");

        if (contrasena.length() >= 12 && tieneMayusculas && tieneEspeciales) return "Muy Fuerte";
        if (contrasena.length() >= 10 && (tieneMayusculas || tieneEspeciales)) return "Fuerte";
        return "Moderada";
    }
}