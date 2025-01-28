import java.util.*;

public class numeroParOImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un número: ");
        int numeroIngresado = sc.nextInt();

        if(numeroIngresado%2 == 0){
            System.out.println("El número ingresado es par");
        } else {
            System.out.println("El número ingresado es impar.");
        }
    }
}