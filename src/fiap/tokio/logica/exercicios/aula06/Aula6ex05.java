package fiap.tokio.logica.exercicios.aula06;

import javax.swing.JOptionPane;

public class Aula6ex05 {
	public static void main(String[] args) {
		String n1str = JOptionPane.showInputDialog("Digite um n�mero");
		float n1 = Float.parseFloat(n1str);
		
		String n2str = JOptionPane.showInputDialog("Digite outro n�mero");
		float n2 = Float.parseFloat(n2str);
		
		String operacao = JOptionPane.showInputDialog("Digite a opera��o que voc� deseja (+ , - , *, /)");
		
		
		switch (operacao) {
		case "+":
			float soma = n1+n2;
			JOptionPane.showMessageDialog(null,"Sua conta � igual a : "+soma);	
			break;
		case "-":
			float subtracao = n1-n2;
			JOptionPane.showMessageDialog(null,"Sua conta � igual a : "+subtracao);	
			break;
		case "*":
			float mult = n1*n2;
			JOptionPane.showMessageDialog(null,"Sua conta � igual a : "+mult);	
			break;
		default :
			float div = n1/n2;
			JOptionPane.showMessageDialog(null,"Sua conta � igual a : "+div);	
		}
		
		
		
		
		
	}
}
