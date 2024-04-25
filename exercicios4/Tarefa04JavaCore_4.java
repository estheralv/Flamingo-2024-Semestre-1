package exercicios4;

import java.util.Scanner;

public class Tarefa04JavaCore_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor em dolár que deseja converter em real: ");
		float dolaresParaSerConvertido = sc.nextFloat();
		
		System.out.println("Digite o valor da cotação em dolár atual(O valor que 1 dolár representa em reais brasileiros): ");
		float cotacaoDolar = sc.nextFloat();
		
		float conversaoDolarEmReais = cotacaoDolar * dolaresParaSerConvertido;
		
			System.out.println("O valor em reais brasileiros é de: R$ " + conversaoDolarEmReais);
			
				sc.close();

	}

}
