package exercicios5;

import java.util.Scanner;

public class Tarefa05JavaCore_8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a hora de início da partida em horas:");
		int horaInicio = sc.nextInt();
		
		System.out.println("Digite a hora do término da partida: ");
		int horaTermino = sc.nextInt();
		
		int duracaoPartida;
		 
	    if (horaTermino > horaInicio) {
	    	duracaoPartida = horaTermino - horaInicio;
	    } else {
	    	duracaoPartida = 24 - horaInicio + horaTermino;
	    }

	    System.out.println("A partida d jogo durou " + duracaoPartida + " horas!");

			sc.close();

	}

}
