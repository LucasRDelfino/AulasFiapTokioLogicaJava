package fiap.tokio.logica.exercicios.aula11;

public class Aula11ex03 {
	public static double  calculadora(char operacao , double n1 , double n2) {
		if (operacao=='+') {
			return n1+n2;
			
		}else if(operacao=='-') {
			return n1-n2;
		}else if(operacao=='*') {
			return n1*n2;
		}else {
			return n1/n2;
		}
		
		
	}	

	public static void main(String[] args) {
		System.out.println(calculadora('*',2,2));
	
	}

}
