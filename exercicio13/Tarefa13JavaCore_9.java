package exercicio13;

import java.util.Scanner;

public class Tarefa13JavaCore_9 {
	
	 public static float calcularArea(float base, float altura) {   
	     return base * altura;
	 }

	public static void main(String[] args) {

		System.out.println("Digite a base e a altura para calcular a área do retângulo: ");
		Scanner sc = new Scanner(System.in);
		float base = sc.nextFloat();
		float altura = sc.nextFloat();
		System.out.println(calcularArea(base, altura));
		
			sc.close();

	}

}
