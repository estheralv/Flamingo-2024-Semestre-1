package exercicios4;

import java.util.Scanner;

public class Tarefa04JavaCore_10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
        System.out.print("Digite a quantidade de votos válidos para o candidato 1 à presidência: ");
        int votosCandidato1 = sc.nextInt();

        System.out.print("Digite a quantidade de votos válidos para o candidato 2 à presidência: ");
        int votosCandidato2 = sc.nextInt();

        System.out.print("Digite a quantidade de votos válidos para o candidato 3 à presidência: ");
        int votosCandidato3 = sc.nextInt();

        System.out.print("Digite a quantidade de votos nulos: ");
        int votosNulos = sc.nextInt();

        System.out.print("Digite a quantidade de votos em branco: ");
        int votosEmBranco = sc.nextInt();

        int totalEleitores = votosCandidato1 + votosCandidato2 + votosCandidato3 + votosNulos + votosEmBranco;

	        double percentualVotosValidos = (double) (votosCandidato1 + votosCandidato2 + votosCandidato3) / totalEleitores * 100;
	        double percentualVotosCandidato1 = (double) votosCandidato1 / totalEleitores * 100;
	        double percentualVotosCandidato2 = (double) votosCandidato2 / totalEleitores * 100;
	        double percentualVotosCandidato3 = (double) votosCandidato3 / totalEleitores * 100;
	        double percentualVotosNulos = (double) votosNulos / totalEleitores * 100;
	        double percentualVotosEmBranco = (double) votosEmBranco / totalEleitores * 100;

        System.out.println("O número total de eleitores é: " + totalEleitores);
        System.out.println("O percentual de votos válidos é de: " + percentualVotosValidos + "%");
        System.out.println("O percentual de votos válidos para o candidato 1 é: " + percentualVotosCandidato1 + "%");
        System.out.println("O percentual de votos válidos para o candidato 2 é: " + percentualVotosCandidato2 + "%");
        System.out.println("O percentual de votos válidos para o candidato 3 é: " + percentualVotosCandidato3 + "%");
        System.out.println("O percentual de votos nulos é de: " + percentualVotosNulos + "%");
        System.out.println("O percentual de votos em branco é de: " + percentualVotosEmBranco + "%");

        	sc.close();

	}

}
