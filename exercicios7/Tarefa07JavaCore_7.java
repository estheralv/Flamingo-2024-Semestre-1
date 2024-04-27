package exercicios7;

import java.util.Scanner;

public class Tarefa07JavaCore_7 {

	public static void main(String[] args) {

	      Scanner sc = new Scanner(System.in);

	      System.out.println("Digite o primeiro valor:");
	      int valor1 = sc.nextInt();

	      System.out.println("Digite o segundo valor:");
	      int valor2 = sc.nextInt();

	        if (valor1 == valor2) {
	            System.out.println("Os números iguais");
	        } else if (valor1 > valor2) {
	            System.out.println("O primeiro número é maior");
	        } else {
	            System.out.println("O segundo número é maior");
	        }

	        	sc.close();

	}

}
