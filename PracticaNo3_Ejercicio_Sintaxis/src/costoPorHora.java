import java.util.*;

public class costoPorHora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas;
        float costeHora;

        System.out.println("Ingrese sus horas trabajadas: ");
        horas = sc.nextInt();

        System.out.println("Ingrese lo que cobra por hora: ");
        costeHora = sc.nextFloat();

        float sueldo_total = (horas * costeHora);

        System.out.println("Estaras cobrando $" + sueldo_total);
    }
}