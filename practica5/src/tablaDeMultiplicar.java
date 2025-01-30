import java.util.*;

public class tablaDeMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un número: ");
        int numero = sc.nextInt();

        System.out.println("La tabla de multiplicar del " + numero + " es la siguiente:");

        for(int i = 1; i <= 10; i++){
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}