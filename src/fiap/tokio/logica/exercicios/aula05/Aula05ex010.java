package fiap.tokio.logica.exercicios.aula05;

import java.util.Scanner;

public class Aula05ex010 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		 
	    
	     System.out.println("Digite quantos anos você tem de idade ");
	     int a = entrada.nextInt();	
	     
	     System.out.println("Digite qauntos meses você tem de idade ");
	     int m = entrada.nextInt();	
	     
	     
	     System.out.println("Digite qauntos dias você tem de idade ");
	     int d = entrada.nextInt();	
		
	     int anos = a*365;
	     int meses = m*30;
	     
	     
	     int total = anos+meses+d;
	         
	     	 
	     
	      

	     System.out.println("O total de dias que você tem de idade é igual a: "+total);
	     
	     
		
		
	}	 
		 
		 
	 }
