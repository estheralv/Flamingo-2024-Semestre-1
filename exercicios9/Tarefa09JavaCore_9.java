package exercicios9;

import java.util.Scanner;

public class Tarefa09JavaCore_9 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Digite um valor positivo (ou um valor negativo para sair): ");
            int valor = sc.nextInt();

            if (valor < 0) {
                break;
            }

            if (valor > maior) {
                maior = valor;
            }

            if (valor < menor) {
                menor = valor;
            }
        }

        if (maior == Integer.MIN_VALUE && menor == Integer.MAX_VALUE) {
            System.out.println("Nenhum valor positivo foi informado.");
        } else {
            System.out.println("Maior valor informado: " + maior);
            System.out.println("Menor valor informado: " + menor);
        }

        sc.close();
    }

}
