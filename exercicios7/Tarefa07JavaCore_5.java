package exercicios7;

import java.util.Scanner;

public class Tarefa07JavaCore_5 {

		public static boolean verificarTriangul(int lado1, int lado2, int lado3) {
			
			if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
	            return false;
	        }
			
			if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
	            return true;
	        } else {
	            return false;
	        }
			
		}

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	        System.out.println("Digite o valor do primeiro lado do triângulo: ");
			int lado1 = sc.nextInt();
			System.out.println("Digite o valor do segundo lado do triângulo: ");
	        int lado2 = sc.nextInt();
	        System.out.println("Digite o valor do terceiro lado do triângulo: ");
	        int lado3 = sc.nextInt();
	        
	        if (verificarTriangul(lado1, lado2, lado3)) {
	            System.out.println("Os números podem ser os comprimentos dos lados de um triângulo.");
	        } else {
	            System.out.println("Os números NÃO podem ser os comprimentos dos lados de um triângulo.");
	        }

	}

}
