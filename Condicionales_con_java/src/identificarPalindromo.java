import java.util.*;

public class identificarPalindromo {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        frase = frase.replace(" ", "");
        frase = frase.replace(",", "");
        frase = frase.replace(".", "");
        System.out.print(frase);
        int ultimo = frase.length() - 1;
        int ini = 0;
        boolean esPalindromo=true;

        while(ini < ultimo){
            if(frase.charAt(ini)!=frase.charAt(ultimo)){
                esPalindromo=false;
            }
            ini++;
            ultimo--;
        }
        if(esPalindromo)
            System.out.print(frase + "\nEs palindromo.");
        else
            System.out.print(frase + "\nNo es palindromo.");

    }
}