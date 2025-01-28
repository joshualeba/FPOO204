import java.util.Scanner;

public class fraseInvertida {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String frase;
        System.out.println("Introduzca su frase:");
        frase = sca.nextLine();
        char[]conver = frase.toCharArray();
        for(int x = conver.length-1; x !=-1; x--){
            System.out.print(conver[x]);
        }
    }
}
