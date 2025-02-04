import java.util.*;

public class arbolNavidad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la base del árbol: ");
        int base = sc.nextInt();

        int fila = 1;
        while (fila <= base) {
            int espacios = (base - fila) / 2;
            int asteriscos = fila;

            int i = 0;
            while (i < espacios) {
                System.out.print(" ");
                i++;
            }

            int j = 0;
            while (j < asteriscos) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            fila += 2;
        }
    }
}