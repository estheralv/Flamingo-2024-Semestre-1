package exercicios7;

import java.util.Scanner;

public class Tarefa07JavaCore_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite três valores desejados e descubra a soma dos dois maiores: ");
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		int numero3 = sc.nextInt();
		
		if (numero1 > numero2 && numero1 > numero3 && numero2 > numero3) {
			System.out.println("A soma de: " + numero1 + " e " + numero2 + ", que são os dois maiores é: " + (numero1 + numero2));
		} else if (numero1 > numero2 && numero1 > numero3 && numero3 > numero2) {
			System.out.println("A soma de: " + numero1 + " e " + numero2 + ", que são os dois maiores é: " + (numero1 + numero3));
		} else if (numero2 > numero1 && numero2 > numero3 && numero1 > numero3) {
			System.out.println("A soma de: " + numero2 + " e " + numero1 + ", que são os dois maiores é: " + (numero2 + numero1));
		} else if (numero2 > numero1 && numero2 > numero3 && numero3 > numero1) {
			System.out.println("A soma de: " + numero2 + " e " + numero3 + ", que são os dois maiores é: " + (numero2 + numero3));
		} else if (numero3 > numero1 && numero3 > numero2 && numero1 > numero2) {
			System.out.println("A soma de: " + numero3 + " e " + numero1 + ", que são os dois maiores é: " + (numero3 + numero1));
		} else if (numero3 > numero1 && numero3 > numero1 && numero2 > numero1) {
			System.out.println("A soma de: " + numero3 + " e " + numero2 + ", que são os dois maiores é: " + (numero3 + numero2));
		}
		
			sc.close();

	}

}
