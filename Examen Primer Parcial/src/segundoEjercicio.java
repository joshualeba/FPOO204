import java.util.*;

public class segundoEjercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero_min = 200;
        int numero_max = 400;

        System.out.println("Ingresa un número par entre el 200 y el 400: ");
        int numero = sc.nextInt();

        System.out.println("La lista de números pares entre " + numero + " y 400 es la siguiente: ");
        for(int i = numero; i <= numero_max; i++){
            if(i % 2 == 0){
                System.out.print(i + ", ");
            }
        }
    }
}
