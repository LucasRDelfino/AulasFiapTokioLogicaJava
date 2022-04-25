package fiap.tokio.logica.exercicios;

import java.util.Scanner;

public class Aula05ex6 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		 

		 System.out.println("Digite o nome do produto ");
	     String  nome = entrada.nextLine();
		  
	      		
		
	     System.out.println("Digite o valor do produto ");
	     double valor1 = entrada.nextDouble();
	     
	     
	     
	     System.out.println("Digite quantos unidades você comprou ");
	     double unit1 = entrada.nextDouble();
	     
	     
	     Scanner entrada2 = new Scanner(System.in);
		 
	     
	     
	     System.out.println("Digite o nome do outro produto ");
	     String  peça2 = entrada2.nextLine();
		  
	      		
		
	     System.out.println("Digite o valor do produto ");
	     double valor2 = entrada2.nextDouble();
	     
	     
	     
	     System.out.println("Digite quantos unidades você comprou ");
	     double unit2 = entrada2.nextDouble();
	     
	     
	     double total = (valor1*unit1) + (valor2*unit2);
	     
	     
	     
	     
	     System.out.println("O total a ser pago é igual a "+total);
				
		
		
		
		
		 
		 
		 
	 }
}

