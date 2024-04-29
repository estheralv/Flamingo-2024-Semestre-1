package exercicios8;

import java.util.Scanner;

public class Tarefa08JavaCore_9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        int total = 0;
        double media = 0;

        System.out.println("Digite 10 valores numéricos:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Valor " + i + ": ");
            int valor = sc.nextInt();
            total += valor;
        }

        media = (double) total / 10;

        System.out.println("Total do somatório: " + total);
        System.out.println("Média aritmética: " + media);

        	sc.close();

	}

}
