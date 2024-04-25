package exercicios3;

import java.util.Scanner;

public class Tarefa03JavaCore_9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da prestação em atraso: ");
		float valorPrestacao = sc.nextFloat();

        System.out.println("Digite a taxa dessa prestação: ");
		float taxaPrestacao = sc.nextFloat();

        System.out.println("Digite o tempo de atraso: ");
		float tempoDeAtraso = sc.nextFloat();

        float valorTotalPrestacaoAtrasada = valorPrestacao + (valorPrestacao * (taxaPrestacao / 100) * tempoDeAtraso);
		
		System.out.println("O valor da prestação incluido a taxa de atraso é: " + valorTotalPrestacaoAtrasada);
		
			sc.close();
		
	}

}
