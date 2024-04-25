package exercicio13;

import java.util.Scanner;

public class Tarefa13JavaCore_2 {
	
	public static int calcularQuadrado(int numero) {
		return numero * numero;
	}

	public static void main(String[] args) {

		System.out.println("Digite um valor para descobrir o seu quadrado: ");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		int quadrado = calcularQuadrado(numero);
		System.out.println("O quadrado de: " + numero + " é " + quadrado + "!");

			sc.close();
		
	}

}
