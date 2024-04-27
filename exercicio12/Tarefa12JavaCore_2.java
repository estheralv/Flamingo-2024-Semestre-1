package exercicio12;

import java.util.Scanner;

public class Tarefa12JavaCore_2 {
		
		public static int fatorialCalculo(int numero) {
			 int fatorial = 1;
			 
			 for (int i = 1; i <= numero; i++) {
				 fatorial *= i;
			 }
			 
			 return fatorial;
		}

		public static void main(String[] args) {
			
			System.out.println("Digite o valor que deseja saber o resultado do calculo do fatorial: ");
			Scanner sc = new Scanner(System.in);
			int numero = sc.nextInt();
			System.out.println(fatorialCalculo(numero));
			
				sc.close();

		}
				
}
