package exercicios3;

import java.util.Scanner;

public class Tarefa03JavaCore_8 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tempo, em horas, gasto na viagem para saber a quantidade de litros que foi utilisado: ");
		float tempoEmHoras = sc.nextFloat();

        System.out.println("Digite a velocidade média, em quilômetros: ");
		float velocidadeEmQuilometros = sc.nextFloat();

            float distanciaPercorrida = tempoEmHoras * velocidadeEmQuilometros;

            float litrosUtilizados = distanciaPercorrida / 12;
		
		System.out.println("A seguir as informações da sua viagem: Velocidade média: " + velocidadeEmQuilometros + "Km/h; Tempo gasto: " + tempoEmHoras + " horas; Distância percorrida: " + distanciaPercorrida + "Km e a quantidade de litros usados: " + litrosUtilizados + "L.");
		
			sc.close();
		
	}

}
