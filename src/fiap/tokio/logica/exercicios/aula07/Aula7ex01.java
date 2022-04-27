package fiap.tokio.logica.exercicios.aula07;

import javax.swing.JOptionPane;

public class Aula7ex01 {
	public static void main(String[] args) {
		
		int c = 0;
		
		while (c<10) {
			c++;
			System.out.println("Olá , Mundo");
			
			if (c==5) {
				int r = JOptionPane.showConfirmDialog(null ,"Quer que continue a mensagem?","",JOptionPane.YES_NO_OPTION);
				if(r==0) {
					continue;
				}else {
					break;
				}
				
			}
			
			
			
		}
		
		
		
		
		
		
		
	}
}
