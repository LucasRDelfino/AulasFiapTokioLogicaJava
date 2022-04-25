package fiap.tokio.logica.exercicios;

import javax.swing.JOptionPane;

public class baguncinha {
	public static void main(String[] args) {
		 
		 
		int n = JOptionPane.showConfirmDialog(null,"<html><h2 color='red' ><i>VOCÊ É GAY?</i></h2></html>","ESSE É O MEU JEITINHO",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);

		        if(n ==  JOptionPane.YES_OPTION){
		            JOptionPane.showMessageDialog(null, "<html><h1><i>AIIIIIIIIIIIIIII <br> AMIGAAAAAAAAAAAA</i></h1></html>","ESSE É O MEU JEITINHO",JOptionPane.WARNING_MESSAGE);
		        }
		        else {
		            JOptionPane.showMessageDialog(null, "<html><h1><i>ESQUISITOOOOOOOOOOOOO</i></h1></html>", "ESSE É O MEU JEITINHIO" , JOptionPane.ERROR_MESSAGE);
		        }
	     
	     
	 }
}
