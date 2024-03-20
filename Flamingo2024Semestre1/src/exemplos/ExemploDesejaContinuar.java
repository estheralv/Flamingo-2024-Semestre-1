package exemplos;

import java.util.Scanner;

public class ExemploDesejaContinuar {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	
		int numero;
		int calculo;
		String resposta = "Sim";
		
		while (resposta.equals("Sim")) {
			System.out.println("Digite um número inteiro: ");
			numero = sc.nextInt();
			calculo = numero * 3;
			System.out.println("O valor da multipicação é: " + calculo);
			System.out.println("Deseja efetuar outro cálculo? ");
			resposta = sc.next();
		}
		
			sc.close();
		
	}
}
