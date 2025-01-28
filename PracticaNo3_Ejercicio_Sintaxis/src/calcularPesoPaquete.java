import java.util.Scanner;

public class calcularPesoPaquete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pesoPayaso = 112, pesoMuneca = 75;

        System.out.println("Ingrese la cantidad de payasos que seran enviados: ");
        int cantidadPayasos = sc.nextInt();
        System.out.println("Ingrese la cantidad de muñecas que seran enviados: ");
        int cantidadMunecas = sc.nextInt();

        int pesoPayasos = (pesoPayaso * cantidadPayasos);
        int pesoMunecas = (pesoMuneca * cantidadMunecas);
        int pesoTotal = pesoMunecas + pesoPayasos;

        System.out.println("El peso total entre las muñecas y los payasos es de " + pesoTotal + "gr");
    }
}
