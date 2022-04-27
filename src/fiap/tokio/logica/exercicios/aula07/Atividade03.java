package fiap.tokio.logica.exercicios.aula07;

import javax.swing.JOptionPane;

public class Atividade03 {

	public static void main(String[] args) {


		String n1str = JOptionPane.showInputDialog("Digite um número");
		
		int n1 = Integer.parseInt(n1str);
		
		int cont = 0;
		
		while (cont < n1) {
			cont++;
			System.out.println(cont);
			
		}

	}

}
