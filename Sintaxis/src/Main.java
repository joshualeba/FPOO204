// IMPORTACIONES
import java.util.*;
import java.beans.JavaBean;

// Clase Pricipal
public class Main {
    //Metodo Main
    /*
    soy
    un comentario
    de varias
    lines
     */
    public static void main(String[] args) {
        System.out.printf("Andres Joshua Leon Barranco");
        String Cadenas = "Joshua" + "Leon" + "Barranco";

        System.out.println(Cadenas);
        System.out.println(Cadenas.length());

        System.out.println(Cadenas.substring(2,5));
        System.out.println(Cadenas.substring(2));
        System.out.println(Cadenas.substring(0,5));

        int x=5,x2;
        double y=1.25,y2;
        String z="204",z1;

        x2 = Integer.parseInt(z);
        z1 = String.valueOf(y);
        double asd=Double.valueOf(x);
        System.out.println(x2);
        System.out.println(z1);
        System.out.println(asd);

        // Conversion implicita
        int num = 12;
        double numD = num;
        System.out.println("Conversion implicita" + numD);

        System.out.println(x2);
        System.out.println(z1);
        System.out.println(asd);

        // Generamos numeros y los guardamos
        Random rdn = new Random();
        int numAleatorio = rdn.nextInt();
        double numDouble = rdn.nextDouble();
        System.out.println("Numero aleatorio entero: " + numAleatorio);
        System.out.println("Numero aleatorio double: " + numDouble);

        // 4. Solicitud de datos
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce cualquier dato: ");
        String dato = sc.nextLine();

        System.out.println("Introduce dato entero: ");
        int datoentero = sc.nextInt();

        System.out.println("Introduce dato con decimales: ");
        double datodecimal = sc.nextDouble();

        System.out.println("Cualquier dato " + dato);
        sc.nextLine();
        System.out.println("Dato entero: " + datoentero);

        // 5. Boolean, operadores lógicos y de comparación
        System.out.println(10 > 9); // TRUE
        System.out.println(10 == 9); // FALSE
        System.out.println(10 < 9); // FALSE
        System.out.println(10 >= 9); // TRUE
        System.out.println(10 <= 9); // FALSE
        System.out.println(10 != 9); // TRUE

        int x = 3;
        System.out.println(x < 5 && x > 10);
        System.out.println(x < 5 || x > 10);
        System.out.println(!(x < 5 && x > 10));
    }
}