import java.util.Random;
import java.util.Scanner;

public class soma {
    public static void main (String [] args){
        Random rand = new Random();
        // Generate random integers in range 0 to 999 
        int rand_int1 = rand.nextInt(1000); 
        int rand_int2 = rand.nextInt(1000); 
        int rando;

        rando = rand_int1 + rand_int2;
        // Print random integers 
        System.out.println("A soma é: "+rando); 
                   
    }
}
