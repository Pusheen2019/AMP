import java.util.Scanner;

public class automovel {
    public static void main (String [] args){
        Scanner teclado = new Scanner (System.in);
        String carro;
        double pi, pf, pfinal,pr;
        
        System.out.println("Digite o preço de fabrica");
        pf = teclado.nextDouble();

        System.out.println("Digite o nome do carro");
        carro = teclado.next();

        pi = (pf * 0.45);

        pr = (pf * 0.28);

        pfinal = (pf + pi) + pr;
        
        System.out.println("Nome " + carro);
        System.out.println("Preço de fabrica " + pf);
        System.out.println("Preço final " + pfinal);
    }
}
