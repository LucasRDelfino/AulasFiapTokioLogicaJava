package fiap.tokio.logica.aulas;

public class Vetornumerico {
	public static void main(String[] args) {
		
		
		int [] numeros = {1 , 2 , 3 , 4 , 5};
		
		for (int i=0; i <= numeros.length ; i++) {
			
			System.out.println("Pos:" + i + "Valor " + numeros[i]);
			
			
		}
		
		
		for (int numero : numeros ) {
			System.out.println("Valor : "+ numero);
			
		}
	}
}
