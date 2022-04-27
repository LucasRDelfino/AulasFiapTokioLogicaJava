package fiap.tokio.logica.exercicios.aula06;

import javax.swing.JOptionPane;

public class Aula6ex06 {

	public static void main(String[] args) {
		String istr = JOptionPane.showInputDialog("Digite sua idade");
		int idade = Integer.parseInt(istr);
		
		
		
		if (idade<=15) {
			JOptionPane.showMessageDialog(null,"Seu voto é proibido este ano");	
			
		}else if (idade<18 || idade>=70) {
			JOptionPane.showMessageDialog(null,"Seu voto é opcional este ano");	
		}else {
			JOptionPane.showMessageDialog(null,"Seu voto é obrigatório este ano");	
		}
		
		
	}

}
