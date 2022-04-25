package fiap.tokio.logica.exercicios;

import java.util.Scanner;

public class Aula05ex5 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
	    System.out.println("Digite a primeira nota ");
	    double n1 = entrada.nextDouble();
	    
	    System.out.println("Digite a segunda nota ");
	    double n2 = entrada.nextDouble();
		
		
		double media = ((n1*4)+(n2*6))/10;		
				
		
		
		
		System.out.println("Sua média ponderada é igual a  "+media+ " !Nota 1 peso 4 , e Nota 2 peso 6");
		 
		 
		 
	 }
}
