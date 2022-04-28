package fiap.tokio.logica.exercicios.aula07;

import javax.swing.JOptionPane;

public class Aula7ex04 {
	public static void main(String[] args) {
	int cc = 0;
	int c =0;
	int d =0;
	while (cc<=10) {
		cc++;
		
		String cstr = JOptionPane.showInputDialog("Digite um número");
		c = Integer.parseInt(cstr);
		
		d = d + c;
		 
		
	}
	System.out.println("A soma dos números é igual a: "+d);
}
}