package exercicios8;

import java.util.Scanner;

public class Tarefa08JavaCore_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para calcular a tabuada: ");
        int numero = sc.nextInt();

        System.out.println("Tabuada de multiplicação para " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        	sc.close();

	}

}
