package fiap.tokio.logica.exercicios.aula05;

import java.util.Scanner;

public class Aula05ex010 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		 
	    
	     System.out.println("Digite quantos anos voc� tem de idade ");
	     int a = entrada.nextInt();	
	     
	     System.out.println("Digite qauntos meses voc� tem de idade ");
	     int m = entrada.nextInt();	
	     
	     
	     System.out.println("Digite qauntos dias voc� tem de idade ");
	     int d = entrada.nextInt();	
		
	     int anos = a*365;
	     int meses = m*30;
	     
	     
	     int total = anos+meses+d;
	         
	     	 
	     
	      

	     System.out.println("O total de dias que voc� tem de idade � igual a: "+total);
	     
	     
		
		
	}	 
		 
		 
	 }
