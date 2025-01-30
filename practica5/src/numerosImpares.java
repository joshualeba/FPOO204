import java.util.*;

public class numerosImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un número: ");
        int numero = sc.nextInt();

            for(int i = 1; i <= numero; i++){
                if(i % 2 != 0){
                    System.out.print(i + ", ");
                }
        }
    }
}