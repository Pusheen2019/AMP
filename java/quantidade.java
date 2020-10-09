
import java.util.Scanner;

public class quantidade {
    public static void main (String [] args){
    
        int quantidademaxima;
        int quantidademinima;
        Scanner ini=new Scanner(System.in);
        double quantidademedia;
           
            System.out.println("entre com a quantidade minima");
                quantidademinima = ini.nextInt();
                    System.out.println("Entre com a quantidade maxima");
                        quantidademaxima = ini.nextInt();
                             quantidademedia = (quantidademinima + quantidademaxima)/2;
                                System.out.println("A quantidade media é " + quantidademedia);
                    
    }
}
