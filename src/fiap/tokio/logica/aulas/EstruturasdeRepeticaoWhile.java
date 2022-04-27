package fiap.tokio.logica.aulas;

public class EstruturasdeRepeticaoWhile {

	public static void main(String[] args) {
		
		int c = 0;
		
		while (c<10) {
			c++;
					
			if (c==3) {
				break;
			}
			
			System.out.println("Cambalhota "+c);
		}
			System.out.println("Fim");
	}

}
