package exercicios3;

import java.util.Scanner;

public class Tarefa03JavaCore_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a sua idade atual em anos completos: ");
		int idadeAnos = sc.nextInt();
		
		int anosEmDias = idadeAnos * 365;
		
		System.out.println("Digite a quantidade de meses desde seu último aniversário: ");
		int idadeMeses = sc.nextInt();
		
		int mesesEmDias = idadeMeses * 30;
		
		System.out.println("Digite a quantidade de dias desde o seu último mesversário: ");
		int idadeDias = sc.nextInt();
		
		int resultado = anosEmDias + mesesEmDias + idadeDias;
		
		System.out.println("Sua idade total em dias é: " + resultado);
		
			sc.close();
		
	}
}
