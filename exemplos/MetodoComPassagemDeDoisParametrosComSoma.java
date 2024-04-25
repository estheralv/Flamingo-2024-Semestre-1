package exemplos;

import java.util.Scanner;

public class MetodoComPassagemDeDoisParametrosComSoma {
	
	static int soma(int x, int y) {
		return x + y;
	}
	
	static double divisao(int x, int y) {
		return x / y;
	}
	
	static int multiplicacao(int x, int y) {
		return x * y;
	}
	
	static int subtracao(int x, int y) {
		return x - y;
	}
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha um valor de 1 à 4 para fazer uma operação matemática: ");
		System.out.println("1. Soma");
		System.out.println("2. Divisão");
		System.out.println("3. Multiplicação");
		System.out.println("4. Subtração");
		int opcao = sc.nextInt();
		
			System.out.println("Digite o valor do primeiro número");
			int valor1 = sc.nextInt();
			
			System.out.println("Digite o valor do segundo número");
			int valor2 = sc.nextInt();
			
		switch (opcao) {
			case 1:
			System.out.println("O resultado da soma  de " + valor1 + " e " + valor2 + " é de: " + soma(valor1, valor2));
				break; 
			case 2:
			System.out.println("O resultado da divisão de " + valor1 + " e " + valor2 + " é de: " + divisao(valor1, valor2));
				break;
			case 3:
			System.out.println("O resultado da multiplicação  de " + valor1 + " e " + valor2 + " é de: " + multiplicacao(valor1, valor2));
				break; 
			case 4:
			System.out.println("O resultado da subtração de " + valor1 + " e " + valor2 + " é de: " + subtracao(valor1, valor2));
				break;
		} 
		
			sc.close();
			
		}
	
}
