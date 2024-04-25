package exercicio13;

import java.util.Scanner;

public class Tarefa13JavaCore_4 {
		
		public static int media(int numero1, int numero2, int numero3) {
			return (numero1 + numero2 + numero3) / 3;
		}

		public static void main(String[] args) {
			
			System.out.println("Digite três valores para descobrir a média entre eles: ");
			Scanner sc = new Scanner(System.in);
			int numero1 = sc.nextInt();
			int numero2 = sc.nextInt();
			int numero3 = sc.nextInt();
			System.out.println(media(numero1, numero2, numero3));

				sc.close();
				
		}

}
