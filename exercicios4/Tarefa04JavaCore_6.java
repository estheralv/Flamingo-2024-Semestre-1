package exercicios4;

import java.util.Scanner;

public class Tarefa04JavaCore_6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro para uma variável \"A\" para descobrir o valor da soma dos quadrados: ");
		int variavelA = sc.nextInt();
		
		System.out.println("Digite um número inteiro para uma variável \"B\": ");
		int variavelB = sc.nextInt();
		
		System.out.println("Digite um número inteiro para uma variável \"C\": ");
		int variavelC = sc.nextInt();
		
		int quadradoVariavelA = variavelA * variavelA;
		int quadradoVariavelB = variavelB * variavelB;
		int quadradoVariavelC = variavelC * variavelC;
		
		int somaDosQuadrados = quadradoVariavelA + quadradoVariavelB + quadradoVariavelC;
		
		System.out.println("A soma dos quadrados dos três valores é: " + somaDosQuadrados);
		
			sc.close();

	}

}
