package exercicios4;

import java.util.Scanner;

public class Tarefa04JavaCore_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro para uma variável \"A\": ");
		int variavelA = sc.nextInt();
		
		System.out.println("Digite um número inteiro para uma variável \"B\": ");
		int variavelB = sc.nextInt();
		
		System.out.println("Digite um número inteiro para uma variável \"C\": ");
		int variavelC = sc.nextInt();
		
		System.out.println("Digite um número inteiro para uma variável \"D\": ");
		int variavelD = sc.nextInt();
		
			//SOMA
			int somaAB = variavelA + variavelB;
			int somaAC = variavelA + variavelC;
			int somaAD = variavelA + variavelD;
			int somaBC = variavelB + variavelC;
			int somaBD = variavelB + variavelD;
			int somaCD = variavelC + variavelD;
			
			//MULTIPLICAÇÃO
			int multiplicacaoAB = variavelA * variavelB;
			int multiplicacaoAC = variavelA * variavelC;
			int multiplicacaoAD = variavelA * variavelD;
			int multiplicacaoBC = variavelB * variavelC;
			int multiplicacaoBD = variavelB * variavelD;
			int multiplicacaoCD = variavelC * variavelD;
			
		System.out.println("A soma das variáveis \"A\" e \"B\" são: " + somaAB);
		System.out.println("A soma das variáveis \"A\" e \"C\" são: " + somaAC);
		System.out.println("A soma das variáveis \"A\" e \"D\" são: " + somaAD);
		System.out.println("A soma das variáveis \"B\" e \"C\" são: " + somaBC);
		System.out.println("A soma das variáveis \"B\" e \"D\" são: " + somaBD);
		System.out.println("A soma das variáveis \"C\" e \"D\" são: " + somaCD);
		
		System.out.println();
		
		System.out.println("A multiplicação das variáveis \"A\" e \"B\" são: " + multiplicacaoAB);
		System.out.println("A multiplicação das variáveis \"A\" e \"C\" são: " + multiplicacaoAC);
		System.out.println("A multiplicação das variáveis \"A\" e \"D\" são: " + multiplicacaoAD);
		System.out.println("A multiplicação das variáveis \"B\" e \"C\" são: " + multiplicacaoBC);
		System.out.println("A multiplicação das variáveis \"B\" e \"D\" são: " + multiplicacaoBD);
		System.out.println("A multiplicação das variáveis \"C\" e \"D\" são: " + multiplicacaoCD);
			
			sc.close();

	}

}
