package exercicios3;

import java.util.Scanner;

public class Tarefa03JavaCore_6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus Fahreinheit: ");
		
		float grausFahreinheit = sc.nextFloat();
		float grausCelsius = ((grausFahreinheit - 32) * 5 / 9);
		
		System.out.println("O resultado dos graus Fahreinheit convertidos em Celsius é: " + grausCelsius);
		
			sc.close();
		
	}
}
