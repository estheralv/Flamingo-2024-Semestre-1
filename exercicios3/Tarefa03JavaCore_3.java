package exercicios3;

import java.util.Scanner;

public class Tarefa03JavaCore_3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu salário mensal atual: ");
		double salarioTotal = sc.nextDouble();
		
		System.out.println("Digite a porcentagem de reajuste: ");
		double reajuste = sc.nextDouble();
		
			double valorReajusteConvertido = reajuste / 100;
			
			double salarioComReajuste = salarioTotal * valorReajusteConvertido;
			
		System.out.println("O valor total do sálario reajustado é: " + salarioComReajuste);
		
				sc.close();
		
	}
}
