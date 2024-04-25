package exercicios3;

import java.util.Scanner;

public class Tarefa03JavaCore_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor total de votos brancos: ");
		double votosBrancos = sc.nextDouble();
		
		System.out.println("Digite o valor total de votos nulos: ");
		double votosNulos = sc.nextDouble();
		
		System.out.println("Digite o valor total de votos válidos: ");
		double votosValidos = sc.nextDouble();
		
			double totalVotos = votosBrancos + votosNulos + votosValidos;
		
				double porcentagemVotosBrancos = (votosBrancos / totalVotos) * 100;
				
				double porcentagemVotosNulos = (votosNulos / totalVotos) * 100;
				
				double porcentagemVotosValidos = (votosValidos / totalVotos) * 100;
		
		System.out.println("O percentual da relação total de eleitores é: Para votos brancos: " + porcentagemVotosBrancos + "%; Para votos nulos: " + porcentagemVotosNulos + "% e para votos válidos: " + porcentagemVotosValidos + "%");
		
			sc.close();
		
	}
}
