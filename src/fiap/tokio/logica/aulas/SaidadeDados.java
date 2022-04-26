package fiap.tokio.logica.aulas;

public class SaidadeDados {
	public static void main(String[] args) {
	float nota = 8.0f;
	
	System.out.println("O Miguel tirou: "+nota);
	System.out.printf("O Miguel tirou : %.2f \n",nota);
	System.out.format("O Miguel tirou %.1f \n", nota);
	
	
	
	String nome = "Arthur";
	
	System.out.printf("O %s tirou %.2f ",nome,nota);
	
	}	

}
