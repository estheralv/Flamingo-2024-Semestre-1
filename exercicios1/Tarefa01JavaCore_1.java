package exercicios1;

import java.util.Scanner;

public class Tarefa01JavaCore_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor para saber o seu sucessor: ");
		int valor = sc.nextInt();
		
		int resultado = valor + 1;
		System.out.println("O sucessor de " + valor + " é: " + resultado);
		
			sc.close();

	}
}
