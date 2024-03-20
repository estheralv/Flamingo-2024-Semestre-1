package exercicios1;

import java.util.Scanner;

public class Tarefa01JavaCore_6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor para a divisão: ");
		float valor1 = sc.nextFloat();
		
		System.out.println("Digite o segundo valor para a divisão: ");
		float valor2 = sc.nextFloat();
		
		float resultado = valor1 / valor2;
		System.out.println("A divisão de " + valor1 + " e " + valor2 + " é: " + resultado);
		
			sc.close();
		
	}
}
