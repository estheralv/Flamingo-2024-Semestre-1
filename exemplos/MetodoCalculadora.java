package exemplos;

import java.util.Scanner;

public class MetodoCalculadora {
	
	static void calculadora(int x, int y) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor de 1 à 4 para fazer uma operação");
		int opcao = sc.nextInt();
		
		int operacao;
		
			if (opcao == 1) {
				operacao = x + y;
				System.out.println("Você escolheu soma, o resultado é: " + operacao);
			} else if (opcao == 2) {
				operacao = x * y;
				System.out.println("Você escolheu multiplicação, o resultado é: " + operacao);
			} else if (opcao == 3) {
				operacao = x - y;
				System.out.println("Você escolheu subtração, o resultado é: " + operacao);
			} else if (opcao == 4) {
				operacao = x / y;
				System.out.println("Você escolheu divisão, o resultado é: " + operacao);
			} else {
				System.out.println("Operação inexistente.");
			}
			
				sc.close();
			
	}

		public static void main(String[] args) {
			calculadora(9, 15);
		}
		
}
