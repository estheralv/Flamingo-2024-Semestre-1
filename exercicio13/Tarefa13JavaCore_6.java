package exercicio13;

import java.util.Scanner;

public class Tarefa13JavaCore_6 {

		public static String maximo(int numero1, int numero2) {
			if (numero1 > numero2) {
				return "O número " + numero1 + " é maior!";
			} else if(numero1 < numero2) {
				return "O número " + numero2 + " é maior!";
			} else {
				return "Os números são iguais.";
			}
		}

		public static void main(String[] args) {

			System.out.println("Digite dois valores para descobrir qual deles é o máximo: ");
			Scanner sc = new Scanner(System.in);
			int numero1 = sc.nextInt();
			int numero2 = sc.nextInt();
			System.out.println(maximo(numero1, numero2));
			
				sc.close();

		}

}
