package exercicios9;

import java.util.Scanner;

public class Tarefa09JavaCore_5 {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[] valores = new int[15];
	        long somatorioFatoriais = 0;

	        System.out.println("Digite 15 valores inteiros:");
	        for (int i = 0; i < 15; i++) {
	            System.out.print("Valor " + (i + 1) + ": ");
	            valores[i] = sc.nextInt();
	        }

	        for (int i = 0; i < 15; i++) {
	            long fatorial = calcularFatorial(valores[i]);
	            somatorioFatoriais += fatorial;
	            System.out.println("Fatorial de " + valores[i] + " é " + fatorial);
	        }

	        System.out.println("\nO somatório dos fatoriais é: " + somatorioFatoriais);

	        sc.close();
	    }

	    public static long calcularFatorial(int n) {
	        if (n < 0) {
	            throw new IllegalArgumentException("Não é possível calcular o fatorial de um número negativo.");
	        }
	        long fatorial = 1;
	        for (int i = 1; i <= n; i++) {
	            fatorial *= i;
	        }
	        return fatorial;
	    }

}
