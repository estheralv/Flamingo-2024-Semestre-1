package exercicios4;

import java.util.Scanner;

public class Tarefa04JavaCore_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro para uma variável \"A\" para descobrir o resultado do quadrado da diferença do primeiro valor pelo segundo: ");
		int variavelA = sc.nextInt();
		
		System.out.println("Digite um número inteiro para uma variável \"B\": ");
		int variavelB = sc.nextInt();
		
		int diferecaEntreVariaveis = variavelA - variavelB;
		int quadradoDaDiferenca = diferecaEntreVariaveis * diferecaEntreVariaveis;
		
			System.out.println("O resultado do quadrado da diferença entre as variáveis é: " + quadradoDaDiferenca);
			
				sc.close();

	}

}
