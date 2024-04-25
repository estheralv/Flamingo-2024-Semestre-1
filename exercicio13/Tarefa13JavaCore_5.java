package exercicio13;

import java.util.Scanner;

public class Tarefa13JavaCore_5 {
	
	public static String ano(int quantidadeDias) {
		if (quantidadeDias == 365) {
			return "O ano não é bissexto!";
		} else if (quantidadeDias == 366) {
			return "O ano é bissexto!";
		} else {
			return "Quantidade de dias inválidada.";
		}
	}

	public static void main(String[] args) {

		System.out.println("Digite a quantidade de dias do ano: ");
		Scanner sc = new Scanner(System.in);
		int quantidadeDias = sc.nextInt();
		System.out.println(ano(quantidadeDias));
		
			sc.close();

	}

}
