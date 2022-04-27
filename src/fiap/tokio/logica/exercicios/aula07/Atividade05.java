package fiap.tokio.logica.exercicios.aula07;

import javax.swing.JOptionPane;

public class Atividade05 {
public static void main(String[] args) {
		
		int c;
		String cstr = JOptionPane.showInputDialog("Digite o quanto de cambalhotas você quer");
		c = Integer.parseInt(cstr);
				
		while(c>50) {
			JOptionPane.showMessageDialog(null,"ASSIM O NEYMAR VAI CANSAR CARA");	
			cstr = JOptionPane.showInputDialog("Digite o quanto de cambalhotas você quer novamente");
			c = Integer.parseInt(cstr);
			
		}
			
		
		
			
			
			
	
		for (int i = 0; i<c; i++) {
			System.out.println("Cambalhota");
		}
	
}
}