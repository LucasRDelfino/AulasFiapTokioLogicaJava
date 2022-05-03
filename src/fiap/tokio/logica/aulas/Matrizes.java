package fiap.tokio.logica.aulas;

public class Matrizes {
	public static void main(String[] args) {
		
		int [][] matriz = new int [2] [7];
		
		matriz [1][4] = 5;
		matriz [1][2] = 6;
		matriz [0][3] = 13;
		

// Percorre um vetor igual a py		
//		for (int numeros : matriz[0]) {
//			System.out.println(numeros);
//		}
		

// Percorre as linhas e colunas de uma matriz
		for (int linha = 0; linha<matriz.length; linha++) {
			for (int i = 0; i<matriz[0].length;i++) {
			System.out.printf("Linha: %d -- Col : %d -- Valor : %d \n",linha,i,matriz[linha][i]);
			
		}
		System.out.println("");
		
	}
}
}
