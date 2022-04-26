package fiap.tokio.logica.exercicios.aula06;

import javax.swing.JOptionPane;

public class Aula6ex03 {

	public static void main(String[] args) {
		String n1str = JOptionPane.showInputDialog("Digite a primeira nota do aluno");
		float n1f = Float.parseFloat(n1str);
		
		String n2str = JOptionPane.showInputDialog("Digite a segunda primeira nota do aluno");
		float n2f = Float.parseFloat(n2str);
		
		String n3str = JOptionPane.showInputDialog("Digite a terceira nota do aluno");
		float n3f = Float.parseFloat(n3str);
		
		String n4str = JOptionPane.showInputDialog("Digite a quarta nota do aluno");
		float n4f = Float.parseFloat(n4str);
		
		float media = (n1f + n2f + n3f + n4f)/4;
		
		if (media<4) {
			JOptionPane.showMessageDialog(null,"REPROVADO MARRECO");				
		}else if (media<6){
			JOptionPane.showMessageDialog(null,"RECUPERAÇÃO MARRECO");	
		}else{
			JOptionPane.showMessageDialog(null,"PASSOU DE ANO JIMMY NEUTRON");	
		}
		


	}

}
