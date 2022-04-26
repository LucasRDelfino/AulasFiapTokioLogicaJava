package fiap.tokio.logica.aulas;

public class Relacionais {
	public static void main(String[] args) {
		//Comparar Strings 
		
		String nome1 = "Alexandre";
		String nome2 = "Alexandre";
		String nome3 = new String ("Alexandre");
		String nome4 = "alexandre";
		
		System.out.println(nome1==nome2);
		System.out.println(nome1==nome3);
		System.out.println(nome1.equals(nome3));
		System.out.println(nome2.equalsIgnoreCase(nome4));
		
	
}
}
