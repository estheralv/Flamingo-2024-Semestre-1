package exercicios5;

import java.util.Scanner;

public class Tarefa05JavaCore_9 {

	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de horas mensais trabalhadas: ");
        int horasTrabalhadas = sc.nextInt();

        System.out.println("Digite o salário por hora: ");
        float salarioPorHora = sc.nextFloat();

        double salarioTotal;
        
        if (horasTrabalhadas <= 40 * 4) {
            salarioTotal = horasTrabalhadas * salarioPorHora;
        } else {
            int horasExtras = horasTrabalhadas - 40 * 4;
            salarioTotal = (40 * 4 * salarioPorHora) + (horasExtras * salarioPorHora * 1.5);
        }

        System.out.println("O salário total do funcionário é: R$" + salarioTotal);

        	sc.close();

	}

}
