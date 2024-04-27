package exercicios7;

import java.util.Scanner;

public class Tarefa07JavaCore_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite três valores desejados e veja qual o maior deles: ");
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		int numero3 = sc.nextInt();
		
		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println(numero1 + ",  é o maior!");
		} else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println(numero2 + ",  é o maior!");
		} else {
			System.out.println(numero3 + ",  é o maior!");
		}
		
			sc.close();

	}

}
