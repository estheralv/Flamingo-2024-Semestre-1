package exercicios3;

import java.util.Scanner;

public class Tarefa03JavaCore_4 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Digite o custo de fábrica do carro: ");
		float custoDeFabrica = sc.nextFloat();
			
		float percentualDistribuidor = 28f / 100;
			
			float valorReajusteDoPercentualdistribuidor = custoDeFabrica * percentualDistribuidor;
			
		float porcentagemImpostos = 45f / 100;
		
			float valorReajusteDosImpostos = custoDeFabrica * porcentagemImpostos;
			
		float valorTotalDoCarroAoConsumidor = custoDeFabrica + valorReajusteDoPercentualdistribuidor + valorReajusteDosImpostos;
				
		System.out.println("O custo final do carro ao consumidor é: " + valorTotalDoCarroAoConsumidor);
			
				sc.close();
			
	}

}
