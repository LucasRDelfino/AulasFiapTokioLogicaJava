package fiap.tokio.logica.exercicios.aula06;

import javax.swing.JOptionPane;

public class Aula6ex08 {
	public static void main(String[] args) {
		String n1str = JOptionPane.showInputDialog("Digite a distância percorrida pelo seu veiculo em km");
		float n1 = Float.parseFloat(n1str);
		
		String n2str = JOptionPane.showInputDialog("Digite o total de gasolina gasta em litros");
		float n2 = Float.parseFloat(n2str);
		
	
		float kml = n1/n2;
		System.out.println(kml);
		
		if (kml<=8) {
			JOptionPane.showMessageDialog(null,"Esse carro bebe em");
			
		}else {
			JOptionPane.showMessageDialog(null,"Autonomia legal");
		}
	
	
	
	
	}
}
