package exercicios1;

import java.util.Scanner;

public class Tarefa01JavaCore_5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor para a multiplicação: ");
		int valor1 = sc.nextInt();
		
		System.out.println("Digite o segundo valor para a multiplicação: ");
		int valor2 = sc.nextInt();
		
		int resultado = valor1 * valor2;
		System.out.println("A multiplicação de " + valor1 + " e " + valor2 + " é: " + resultado);
		
			sc.close();
		
	}
}
