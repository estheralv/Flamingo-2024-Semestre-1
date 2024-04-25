package exercicio13;

import java.util.Scanner;

public class Tarefa13JavaCore_3 {
	
	public static String verificacao(int numero) {
		if (numero > 0) {
			return "O número é positivo!";
		} else if (numero < 0) {
			return "O número negativo!";
		} else {
			return "O número é zero";
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Digite um valor para descobrir se é positivo, negativo ou zero: ");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		System.out.println(verificacao(numero));

			sc.close();
			
	}

}
