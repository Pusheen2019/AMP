import java.util.Scanner;

public class media {
    public static void main (String [] args){
    
        int n1,n2,n3,n4;
        double media;
        Scanner ini=new Scanner(System.in);
           
            System.out.println("Primeiro numero");
            n1 = ini.nextInt();

            System.out.println("Segundo numero");
            n2 = ini.nextInt();

            System.out.println("Terceiro numero");
            n3 = ini.nextInt();

            System.out.println("Quarto numero");
            n4 = ini.nextInt();

            media = (n1 + n2 + n3 + n4) / 2;

            System.out.println("A média é: " + media);


                    
    }
}
