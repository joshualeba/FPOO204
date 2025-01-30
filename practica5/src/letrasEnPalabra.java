import java.util.Scanner;

public class letrasEnPalabra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa una frase: ");
        String frase = sc.nextLine();

        System.out.print("Ingresa una letra: ");
        char letra = sc.next().charAt(0);

        int contador = 0;
        int i = 0;

        while (i < frase.length()) {
            if (frase.charAt(i) == letra) {
                contador++;
            }
            i++;
        }
        System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la frase.");
    }
}