import java.util.*;

public class precioSalaDeJuegos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu edad: ");
        int edad = sc.nextInt();

        if(edad <= 4){
            System.out.println("Puedes pasar gratis.");
        } else if (edad > 4 && edad < 17){
            System.out.println("Tienes que pagar $110.");
        } else if (edad >= 18){
            System.out.println("Tienes que pagar $190.");
        }
    }
}