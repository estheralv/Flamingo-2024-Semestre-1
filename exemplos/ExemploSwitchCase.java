package exemplos;

import java.util.Scanner;

public class ExemploSwitchCase {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número de 1 a 7 para saber o dia da semana");
		int dia = sc.nextInt();
		
		switch (dia) {
			
			case 1:
				System.out.println("Hoje é domingo.");
				break;
			case 2:
				System.out.println("Hoje é segunda-feira.");
				break;
			case 3:
				System.out.println("Hoje é terça-feira.");
				break;
			case 4:
				System.out.println("Hoje é quarta-feira.");
				break;
			case 5:
				System.out.println("Hoje é quinta-feira.");
				break;
			case 6:
				System.out.println("Hoje é sexta-feira.");
				break;
			case 71:
				System.out.println("Hoje é sábado.");
				break;
		
		}
		
				sc.close();
		
	}
	
}
