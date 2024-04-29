package exercicios8;

import java.util.Scanner;

public class Tarefa08JavaCore_6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base (B): ");
        double base = sc.nextDouble();
        System.out.print("Digite o expoente (E): ");
        int expoente = sc.nextInt();

        double resultado = 1;

        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }

        System.out.println("O resultado de " + base + " elevado a " + expoente + " é: " + resultado);

        	sc.close();

	}

}
