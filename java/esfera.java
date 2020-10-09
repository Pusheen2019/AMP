import java.util.Scanner;

public class esfera {
public static void main (String [] args){
Scanner teclado = new Scanner (System.in);
double pi = 3.14159 , raio, volume;

System.out.println("Digite o raio");
raio = teclado.nextDouble();

volume = (4.0/3) * pi * Math.pow(raio,3);

System.out.printf("VOLUME = %.3f\n",volume);
 }
}
