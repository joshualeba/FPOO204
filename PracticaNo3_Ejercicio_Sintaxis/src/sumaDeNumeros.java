import java.util.Scanner;

public class sumaDeNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 0;
        int suma = 0;

        System.out.print("Ingrese un numero entero hastas el cual desee sumar: ");
        x = sc.nextInt();

        for(int i = 1; i<=x; i++){

            suma += i;
            System.out.println("La suma acumulada hasta " + i + " es: " + suma);

        }
    }
}