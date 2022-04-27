package fiap.tokio.logica.exercicios.aula06;

import javax.swing.JOptionPane;

public class Aula6ex04 {
	public static void main(String[] args) {
		String n1str = JOptionPane.showInputDialog("Digite um número");
		
		int n1 = Integer.parseInt(n1str);
		
		
		String n2str = JOptionPane.showInputDialog("Digite outro número");
		
		int n2 = Integer.parseInt(n2str);
		
		
		if (n2%n1==0 || n2%n1==0) {
			 JOptionPane.showMessageDialog(null,"Os números são múltiplos");
			
		}else {
			JOptionPane.showMessageDialog(null,"Os números não são múltiplos");
							
		}
			
		
		
		
		
		
	}
}
