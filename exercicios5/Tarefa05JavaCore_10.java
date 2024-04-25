package exercicios5;

import java.util.Scanner;

public class Tarefa05JavaCore_10 {

	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salário fixo atual do vendedor: ");
	    float salarioFixo = sc.nextFloat();

	    System.out.println("Digite o valor das vendas efetuadas: ");
	    float vendas = sc.nextFloat();

	    float comissao;
	    
	    if (vendas <= 1500) {
	    	comissao = vendas * 0.03f;
	    } else {
	        comissao = (1500 * 0.03f) + ((vendas - 1500) * 0.05f);
	    }

	    float salarioTotal = salarioFixo + comissao;

	    System.out.println("O salário total do vendedor é de: R$" + salarioTotal);

	    	sc.close();

	}

}
