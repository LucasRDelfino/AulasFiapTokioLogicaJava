package fiap.tokio.logica.exercicios.aula11;

public class Aula11ex02 {
	
	public static String verificarIdade (int idade) {
		if (idade<=15) {
			return "Proibido";
		}else if (idade<18 || idade>70) {
			return "Opcional";
		}else {
			return "Obrigatório";
		}
		
		
		
	}
	public static void main(String[] args) {
		
		System.out.println(verificarIdade(18));
		
		
	}
}
