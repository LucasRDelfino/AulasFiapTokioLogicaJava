package fiap.tokio.logica.exercicios.aula06;
import javax.swing.JOptionPane;
public class Aula6ex01 {
	public static void main(String[] args) {
		String n = JOptionPane.showInputDialog("Digite um n�mero");
		
		int n1 = Integer.parseInt(n);
		
		
		if (n1%2==0) {
		 JOptionPane.showMessageDialog(null,"O n�mero � par");
		}else {
			JOptionPane.showMessageDialog(null,"O n�mero � �mpar");
		}
		
	}
}
