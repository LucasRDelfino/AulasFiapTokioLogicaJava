package fiap.tokio.logica.exercicios.aula06;

import javax.swing.JOptionPane;

public class Aula6ex02 {

	public static void main(String[] args) {
		
		String n1str = JOptionPane.showInputDialog("Digite um n�mero");
		int n1int = Integer.parseInt(n1str);
		
		String n2str = JOptionPane.showInputDialog("Digite outro n�mero");
		int n2int = Integer.parseInt(n2str);

		
		
		if (n1int>n2int) {
			JOptionPane.showMessageDialog(null,"O primeiro n�mero � maior que o segundo");
		}else if (n1int==n2int) {
			JOptionPane.showMessageDialog(null,"Os dois n�meros tem o mesmo valor");			
		}else {
			JOptionPane.showMessageDialog(null,"O segundo n�mero � maior que o primeiro");			
		}
		
		
		
		
	}

}
