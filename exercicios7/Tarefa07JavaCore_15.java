package exercicios7;

import java.util.Scanner;

public class Tarefa07JavaCore_15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número do empregado:");
        int codigo = sc.nextInt();

        System.out.println("Digite o ano de nascimento do empregado:");
        int anoNascimento = sc.nextInt();

        System.out.println("Digite o ano de ingresso na empresa:");
        int anoIngresso = sc.nextInt();

        int idade = 2024 - anoNascimento;
        int tempoTrabalho = 2024 - anoIngresso;

        boolean requerAposentadoria = (idade >= 65) || (tempoTrabalho >= 30) || (idade >= 60 && tempoTrabalho >= 25);

        System.out.println("Idade do empregado: " + idade + " anos");
        System.out.println("Tempo de trabalho na empresa: " + tempoTrabalho + " anos");

	        if (requerAposentadoria) {
	            System.out.println("Requer aposentadoria.");
	        } else {
	            System.out.println("Não requer aposentadoria.");
	        }
	
	        	sc.close();

	}

}
