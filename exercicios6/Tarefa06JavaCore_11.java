package exercicios6;

import java.util.Scanner;

public class Tarefa06JavaCore_11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor inteiro:");
        int valor = sc.nextInt();

        if (valor <= 3) {
            System.out.println("O valor digitado é: " + valor + ", e não é maior que três!");
        } else {
        	System.out.println("O valor digitado é maior que três.");
        }

        	sc.close();

	}

}
