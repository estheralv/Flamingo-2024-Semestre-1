package exercicios1;

import java.util.Scanner;

public class Tarefa01JavaCore_10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da diagonal maior do losângo para calcular sua área: ");
		float valor1 = sc.nextFloat();
		
		System.out.println("Digite o valor da diagonal menor do losângo para calcular sua área: ");
		float valor2 = sc.nextFloat();
		
		float resultado = (valor1 * valor2) / 2;
		System.out.println("A área do losângo de diagonal maior " + valor1 + " e diagonal maior " + valor2 + " é: " + resultado);
		
			sc.close();
		
	}
}
