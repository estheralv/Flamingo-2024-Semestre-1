package exemplos;

import java.util.Scanner;

public class ExemploTabuada {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro de 1 à 10 para visulizar sua tabuada: ");
		int numero = sc.nextInt();
		
		int contador = 1;
		
		while (contador < 11) {
			System.out.println(numero + " X " + contador + " = " + numero * contador);
			contador++;
		}
		
			sc.close();
		
	}
}
