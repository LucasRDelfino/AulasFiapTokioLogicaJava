package fiap.tokio.logica.exercicios;

import java.util.Scanner;

public class Aula05ex9 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		 
	    
	     System.out.println("Digite o valor em Real ");
	     String n = entrada.nextLine();	
		
	     
	     	 
	     
	     char centena = n.charAt(0); 
	     char dezena = n.charAt(1);    
	     char unidade = n.charAt(2);    

	     System.out.println("Centena:"+centena+"00\nDezena :"+dezena+"0\nUnidade:"+unidade);
	     
	     
		
		
	}	 
		 
		 
	 }
