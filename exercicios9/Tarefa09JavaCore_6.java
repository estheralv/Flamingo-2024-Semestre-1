package exercicios9;

import java.util.Scanner;

public class Tarefa09JavaCore_6 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int contador = 0;
        
        System.out.println("Digite valores positivos (digite um valor negativo para parar):");

        while (true) {
            System.out.print("Digite um valor: ");
            int valor = sc.nextInt();

            if (valor < 0) {
                break;
            }

            soma += valor;
            contador++;
        }

        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("\nTotal do somatório: " + soma);
            System.out.println("Média aritmética: " + media);
            System.out.println("Total de valores lidos: " + contador);
        } else {
            System.out.println("Nenhum valor positivo foi fornecido.");
        }

        sc.close();
    }

}
