package exercicios3;

import java.util.Scanner;

public class Tarefa03JavaCore_5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus Celsius: ");
		
		float grausCelsius = sc.nextFloat();
		float grausFahreinheit = (9 * grausCelsius + 160) / 5;
		
		System.out.println("O resultado dos graus Celsius convertidos em Fahreinheit é: " + grausFahreinheit);
		
			sc.close();
		
	}
}
