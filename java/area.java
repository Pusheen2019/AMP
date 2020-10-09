import java.util.*;  
public class area
{
 public static void main (String args[])
 {
 float base, altura, area;
Scanner entrada;
// Instancia o objeto da classe Scanner para receber as entradas
entrada = new Scanner(System.in); 
// Mostra mesnsagem antes da leitura da base
System.out.print("Digite a base do Triângulo:");
//Recebe a base
base = entrada.nextFloat();
// Mostra mesnsagem antes da leitura da altura
System.out.println("Digite a altura do Triângulo:");
// Recebe a altura
altura = entrada.nextFloat();
// Calcula a área
area = (base * altura )/2;
  // Mostra a área
  System.out.println("Área do Triângulo = "+ area);
 }
}