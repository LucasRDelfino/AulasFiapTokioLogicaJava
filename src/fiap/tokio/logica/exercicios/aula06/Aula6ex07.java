package fiap.tokio.logica.exercicios.aula06;

import javax.swing.JOptionPane;

public class Aula6ex07 {
	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		int c = 4;
		int d = 8;
		
		
		
		
		if (a <= b && b <d){
			System.out.println("A = TRUE");
		}else {
			System.out.println(" A = FALSE");
		}
		
		
		
		if ((a == b) || (c != b)){
			System.out.println("B = TRUE");
		}else {
			System.out.println("B = FALSE");
		}
		
		
		if ((d>a) && (c >= b)){
			System.out.println("c= TRUE");
		}else {
			System.out.println("B = FALSE");
		}
		
		
		
		if ((a <= b) || (c <= b)){
			System.out.println("D = TRUE");
		}else {
			System.out.println("D = FALSE");
		}
		
		
		if ((b > c) || (c < a) && (d <=b)){
			System.out.println("E = TRUE");
		}else {
			System.out.println("E = FALSE");
		}
		
		
		
		
		
	}
}
