package fiap.tokio.logica.aulas;
import java.util.*;

import javax.swing.JOptionPane;
public class EstruturasdeRepeticaoFor {
	public static void main(String[] args) {
		
		String n1str = JOptionPane.showInputDialog("Digite um número");
		
		int n1 = Integer.parseInt(n1str);
		
		for (int i = 0; i <= 5; i++) {
			System.out.println(+n1+"x"+i+"="+(n1*i));
			
			
		}
		
		
		
	}
}
