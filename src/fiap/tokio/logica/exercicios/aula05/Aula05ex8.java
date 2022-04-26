package fiap.tokio.logica.exercicios.aula05;

import java.util.Scanner;

public class Aula05ex8 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		 
	    
	     System.out.println("Digite o valor em Real ");
	     float valorReal = entrada.nextFloat();	
		
	     
	     	 
	     
	     float dolar = valorReal/4.62f;
	     float euro = valorReal/5.02f;
	     float parentino = valorReal*24.66f;
	     float libra = valorReal/6.04f;
	     float iene = valorReal*27.67f;
	          
	     
	     
	     
	     System.out.printf("Valor em Real : %.2f \nValor em dólar : %.2f \nValor em euro : %.2f \nValor em peso argentino : %.2f "
	     		+ "\nValor em libra : %.2f \nValor em iene : %.2f"
	    		, valorReal , dolar,euro,parentino,libra,iene);
				
		
		
		
		
		 
		 
		 
	 }

}
