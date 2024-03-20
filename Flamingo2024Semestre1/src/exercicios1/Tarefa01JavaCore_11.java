package exercicios1;

import java.util.Scanner;

public class Tarefa01JavaCore_11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da base maior do trapézio para calcular sua área: ");
		float valor1 = sc.nextFloat();
		
		System.out.println("Digite o valor da base menor do trapézio para calcular sua área: ");
		float valor2 = sc.nextFloat();
		
		System.out.println("Digite o valor da altura do trapézio para calcular sua área: ");
		float valor3 = sc.nextFloat();
		
		float resultado = ((valor1 + valor2) * valor3) / 2;
		System.out.println("A área do trapézio de base maior " + valor1 + ", base menor " + valor2 + " e altura " + valor3 + " é: " + resultado);
	
			sc.close();
			
	}
}
