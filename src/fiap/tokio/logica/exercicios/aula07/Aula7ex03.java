package fiap.tokio.logica.exercicios.aula07;

import javax.swing.JOptionPane;

public class Aula7ex03 {
	public static void main(String[] args) {
		int c;
		String cstr = JOptionPane.showInputDialog("Digite o quanto de cambalhotas você quer");
		c = Integer.parseInt(cstr);
		
		for (int i =0;  i<26 ; i++) {
			
			System.out.println(+c+"x"+i+"="+c*i);
			
			
		}
	}	
}
