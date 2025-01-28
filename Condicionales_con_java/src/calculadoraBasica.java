import java.util.*;

public class calculadoraBasica {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el primer número para la operación: ");
        float primerNumero = sc.nextFloat();
        System.out.println("Ingresa el segundo número para la operación: ");
        float segundoNumero = sc.nextFloat();

        System.out.println("Ingresa qué operación deseas realizar...\n1 para suma\n2 para resta\n3 para multiplicación\n4 para división");
        int operador = sc.nextInt();

        float suma = primerNumero + segundoNumero;
        float resta = primerNumero - segundoNumero;
        float multi = primerNumero * segundoNumero;
        float div = primerNumero / segundoNumero;

        switch(operador){
            case 1:
                System.out.println("El resultado de la suma es de: " + suma);
                break;
            case 2:
                System.out.println("El resultado de la resta es: " + resta);
                break;
            case 3:
                System.out.println("El resultado de la multiplicación es de: " + multi);
                break;
            case 4:
                System.out.println("El resultado de la división es de: " + div);
                break;
            default:
                System.out.println("Ingresa una operación válida porfa.");
        }
    }
}