package fiap.tokio.logica.exercicios.aula10;

import javax.swing.JOptionPane;

public class Aula10ex02 {
	static void calcularArea(double base , double altura) {
		double Area = base*altura;
		JOptionPane.showMessageDialog(null,"A �rea do ret�ngulo � igual a "+Area);
		
	}
	public static void main(String[] args) {
		String basestr = JOptionPane.showInputDialog("Digite a base do ret�ngulo");
		double base = Double.parseDouble(basestr);
		
		String alturastr = JOptionPane.showInputDialog("Digite a altua do ret�ngulo");
		double altura = Double.parseDouble(alturastr);
		
		calcularArea(base , altura);
		
	}

}
