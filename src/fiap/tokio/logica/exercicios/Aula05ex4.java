package fiap.tokio.logica.exercicios;

import java.util.Scanner;

public class Aula05ex4 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
	    System.out.println("Digite a primeira nota ");
	    double n1 = entrada.nextDouble();
	    
	    System.out.println("Digite a segunda nota ");
	    double n2 = entrada.nextDouble();
		
		
		double media = (n1+n2)/2;
		
		
		System.out.println("Sua m�dia � igual a "+media);
		 
		 
		 
	 }
}
