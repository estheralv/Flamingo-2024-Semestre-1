package exercicios6;

import java.util.Scanner;

public class Tarefa06JavaCore_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha dois números inteiros para descobrir a diferemça do maior pelo menor.");
		System.out.println("Qual o primeiro número?");
		int numero1 = sc.nextInt();
		System.out.println("Qual o segundo número?");
		int numero2 = sc.nextInt();
		
		int diferenca;
		
			if (numero1 > numero2) {
				diferenca = numero1 - numero2;
				System.out.println("A diferença de " + numero1 + " e " + numero2 + " é de: " + diferenca);
			} else {
				diferenca = numero2 - numero1;
				System.out.println("A diferença de " + numero2 + " e " + numero1 + " é de: " + diferenca);
			}
			
				sc.close();

	}

}
