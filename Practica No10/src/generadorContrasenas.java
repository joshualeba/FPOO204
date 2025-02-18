import javax.swing.JOptionPane;
import java.util.Random;

public class generadorContrasenas {
    public static final String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    public static final String MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String ESPECIALES = "!@#$%^&*()_+";

    public static void main(String[] args) {
        int longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud de la contraseña (8 por defecto):", "8"));
        boolean incluirMayusculas = JOptionPane.showConfirmDialog(null, "¿Incluir mayúsculas?", "Especificaciones", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        boolean incluirEspeciales = JOptionPane.showConfirmDialog(null, "¿Incluir caracteres especiales?", "Especificaciones", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;

        String contrasena = generarContrasena(longitud, incluirMayusculas, incluirEspeciales);
        JOptionPane.showMessageDialog(null, "Contraseña generada: " + contrasena);

        String fortaleza = comprobarFortalezaContrasena(contrasena);
        JOptionPane.showMessageDialog(null, "Fortaleza de la contraseña: " + fortaleza);
    }

    public static String generarContrasena(int longitud, boolean incluirMayusculas, boolean incluirEspeciales) {
        String caracteres = MINUSCULAS;
        if (incluirMayusculas) caracteres += MAYUSCULAS;
        if (incluirEspeciales) caracteres += ESPECIALES;

        Random random = new Random();
        StringBuilder contrasena = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(caracteres.length());
            contrasena.append(caracteres.charAt(indice));
        }

        return contrasena.toString();
    }

    public static String comprobarFortalezaContrasena(String contrasena) {
        if (contrasena.length() < 8) return "Débil";
        boolean tieneMayusculas = !contrasena.equals(contrasena.toLowerCase());
        boolean tieneEspeciales = contrasena.matches(".*[!@#$%^&*()_+].*");

        if (contrasena.length() >= 12 && tieneMayusculas && tieneEspeciales) return "Muy Fuerte";
        if (contrasena.length() >= 10 && (tieneMayusculas || tieneEspeciales)) return "Fuerte";
        return "Moderada";
    }
}