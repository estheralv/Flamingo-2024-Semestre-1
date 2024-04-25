package exemplos;

import java.util.Scanner;

public class AlgoritmoSoma {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor1 = sc.nextInt();
		
		System.out.println("Digite outro valor: ");
		int valor2 = sc.nextInt();
		
		int resultado = valor1 + valor2;
		System.out.println("A soma dos valores é: " + resultado);
		
			sc.close();
		
	}
}
