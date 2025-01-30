import java.util.*;

public class cuentaRegresiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un número: ");
        int numero = sc.nextInt();

        for(int i = numero; i >= 0; i--){
            System.out.print(i + ", ");
        }
    }
}