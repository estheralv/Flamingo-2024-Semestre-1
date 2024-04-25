package exercicios4;

import java.util.Scanner;

public class Tarefa04JavaCore_9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do seu sálario mensal: ");
		float salariomensal = sc.nextFloat();
		
		System.out.println("Digite o valor do percentual de reajuste: ");
		float reajuste = sc.nextFloat();
		
		float valorReajuste = salariomensal * (reajuste / 100);
		
		float salarioComReajuste = salariomensal + valorReajuste;
		
		System.out.println("O valor do seu novo salário é: R$ " + salarioComReajuste);
		
			sc.close();

	}

}
