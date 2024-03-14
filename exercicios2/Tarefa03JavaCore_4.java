package exercicios2;

import java.util.Scanner;

public class Tarefa03JavaCore_4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o custo de fábrica do carro: ");
		double custoDeFabrica = sc.nextDouble();
		
			double percentualDistribuidor = 28 /100;
		
		double valorReajusteDoPercentualdistribuidor = custoDeFabrica / percentualDistribuidor;
		
			double porcentagemImpostos = 45 / 100;
		
		double valorReajusteDosImpostos = custoDeFabrica / impostos;
		
			double valorTotalDoCarroAoConsumidor = custoDeFabrica + valorReajusteDoPercentualdistribuidor + valorReajusteDosImpostos;
			
		System.out.println("O custo final do carro ao consumidor é: " + valorTotalDoCarroAoConsumidor);
		
				sc.close();
		
}
