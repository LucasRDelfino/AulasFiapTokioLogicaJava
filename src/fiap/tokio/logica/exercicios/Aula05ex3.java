package fiap.tokio.logica.exercicios;

import java.util.Scanner;

public class Aula05ex3 {
	 public static void main(String[] args) {

		 Scanner entrada = new Scanner(System.in);
		 

		 System.out.println("Digite seu nome ");
	     String  nome = entrada.nextLine();
		  
	      
		 
		 System.out.println("Digite seu gênero : M , F , O , N");
	     char genero = entrada.nextLine().charAt(0);
		  
		 
		 
		 System.out.println("Olá , "+nome+" ! Você escolheu a seguinte opção de gênero:"+genero);
		 
		 
		 
	 }
}
