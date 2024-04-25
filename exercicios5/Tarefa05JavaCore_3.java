package exercicios5;

import java.util.Scanner;

public class Tarefa05JavaCore_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de maçãs compradas: ");
		float macas = sc.nextFloat();
		
		float precoMacas;
		
		if (macas < 12) {
			precoMacas = 1.30f;
			System.out.println("O custo total da compra é: R$ " + macas * precoMacas);
		} else {
			precoMacas = 1.00f;
			System.out.println("O custo total da compra é: R$ " + macas * precoMacas);
		}
		
			sc.close();

	}

}
