package fiap.tokio.logica.exercicios.aula06;

import javax.swing.JOptionPane;

public class Aula6ex9 {
	public static void main(String[] args) {
		
		String tstr = JOptionPane.showInputDialog("Digite qual � a sua resid�ncia 1.Casa 2.Com�rcio 3.Ind�stria");
		int  t = Integer.parseInt(tstr);
		
		String wstr = JOptionPane.showInputDialog("Digite quantos watts voc� gastou no m�s");
		float w = Float.parseFloat(wstr);
		
		float total;
		
		switch (t) {
		case 1:
			total = w*0.60f;
			JOptionPane.showMessageDialog(null,"Sua conta � igual a "+total);
			break;
		case 2 :
			total = w*0.48f;
			JOptionPane.showMessageDialog(null,"Sua conta � igual a "+total);
			break;
		default :
			total = w*1.29f;
			JOptionPane.showMessageDialog(null,"Sua conta � igual a "+total);
			break;
		}
		
		
		
	
	
	
	
	
	}
}
