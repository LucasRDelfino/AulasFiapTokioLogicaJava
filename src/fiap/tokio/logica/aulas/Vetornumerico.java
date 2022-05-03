package fiap.tokio.logica.aulas;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Vetornumerico {
	public static void main(String[] args) {
		
		
		double [] notas = new double [5];
		Scanner entrada = new Scanner(System.in);
		double c = 0;
		
		for (int i=0; i < notas.length ; i++) {   
			String cstr = JOptionPane.showInputDialog("Digite sua nota");
			double bleh = Double.parseDouble(cstr);
		     
		     c +=  bleh;
		    		 
			
			
		}
		
		double media = c/notas.length;
		System.out.println(media);
		
	}
}
