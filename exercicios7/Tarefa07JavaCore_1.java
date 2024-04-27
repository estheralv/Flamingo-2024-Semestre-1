package exercicios7;

import java.util.Scanner;

public class Tarefa07JavaCore_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor que deseja: ");
		int valor = sc.nextInt();
		
		if (valor > 0) {
			System.out.println("O valor fornecido é positivo!");
		} else if (valor == 0){
			System.out.println("O valor fornecido é zero!");
		} else if (valor < 0) {
		 	System.out.println("O valor fornecido é negativo!");
		}
		
			sc.close();

	}

}
