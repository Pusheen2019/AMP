
import java.util.Scanner;

public class quadrado {
    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        int entrada;
        int resultado;

        System.out.println("Digite um numero");
        entrada = numero.nextInt();
        resultado = entrada * entrada;

        System.out.println(resultado);
 
    }
}