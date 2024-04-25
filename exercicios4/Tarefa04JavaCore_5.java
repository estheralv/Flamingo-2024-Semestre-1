package exercicios4;

import java.util.Scanner;

public class Tarefa04JavaCore_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor em reais que deseja converter em dolár: ");
		float reaisParaSerConvertido = sc.nextFloat();
		
		System.out.println("Digite o valor da cotação em dolár atual(O valor que 1 dolár representa em reais brasileiros): ");
		float cotacaoDolar = sc.nextFloat();
		
		float conversaoREaisEmDolar = cotacaoDolar * reaisParaSerConvertido;
		
			System.out.println("O valor em dolár americano é de: US$ " + conversaoREaisEmDolar);
			
				sc.close();

	}

}
