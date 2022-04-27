package fiap.tokio.logica.exercicios.aula06;

import javax.swing.JOptionPane;

public class Aula6ex10 {
	public static void main(String[] args) {
	String cstr = JOptionPane.showInputDialog("Digite o seu salario");
	float salario  = Float.parseFloat(cstr);
	
	String percentual;
	float  Vaumento , total;
	
	
	
	if (salario<=280.00) {
		percentual = "20%";
		Vaumento = salario*0.20f;
		total = Vaumento+salario;
		JOptionPane.showMessageDialog(null,"Salário :  "+salario+"\nPercentual : "+percentual+"\nValor do aumento : "+Vaumento+"\nNovo salário : "+total);	
		
	}else if (salario<700.00) {
		percentual = "15%";
		Vaumento = salario*0.15f;
		total = Vaumento+salario;
		JOptionPane.showMessageDialog(null,"Salário :  "+salario+"\nPercentual : "+percentual+"\nValor do aumento : "+Vaumento+"\nNovo salário : "+total);	
		
	}else if (salario<1500.00) {
		percentual = "10%";
		Vaumento = salario*0.10f;
		total = Vaumento+salario;
		JOptionPane.showMessageDialog(null,"Salário :  "+salario+"\nPercentual : "+percentual+"\nValor do aumento : "+Vaumento+"\nNovo salário : "+total);	           
	
	}else {
		percentual = "5%";
		Vaumento = salario*0.05f;
		total = Vaumento+salario;
		JOptionPane.showMessageDialog(null,"Salário :  "+salario+"\nPercentual : "+percentual+"\nValor do aumento : "+Vaumento+"\nNovo salário : "+total);	           
	
		
	}
	
	
	}
}
	
	
	

