package fiap.tokio.logica.aulas;

import javax.swing.JOptionPane;

public class Metodos {
	
	static void saudacao(String nome , int idade){
		
		if (idade<18) {
			JOptionPane.showMessageDialog(null,"Olá "+nome+" você é menor de idade");
		}else {
			JOptionPane.showMessageDialog(null,"Olá "+nome+" você é maior de idade");
			}
		
	}
	public static void main(String[] args) {
		
		System.out.println("Seja Bem vindo ao programa!!!");
		
		String nome = JOptionPane.showInputDialog("Digite seu nome ");
		
		String idadestr = JOptionPane.showInputDialog("Digite sua idade");
		int idade = Integer.parseInt(idadestr);
		
		
		saudacao(nome,idade);
		
	}
}
