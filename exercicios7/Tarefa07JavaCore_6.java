package exercicios7;

import java.util.Scanner;

public class Tarefa07JavaCore_6 {

	public static void main(String[] args) {

	       Scanner sc = new Scanner(System.in);

	        System.out.println("Digite o nome do primeiro time:");
	        String time1 = sc.nextLine();

	        System.out.println("Digite o número de gols marcados pelo " + time1 + ":");
	        int golsTime1 = sc.nextInt();

	        System.out.println("Digite o nome do segundo time:");
	        sc.nextLine();
	        String time2 = sc.nextLine();

	        System.out.println("Digite o número de gols marcados pelo " + time2 + ":");
	        int golsTime2 = sc.nextInt();

		        if (golsTime1 > golsTime2) {
		            System.out.println("Vencedor: " + time1);
		        } else if (golsTime2 > golsTime1) {
		            System.out.println("Vencedor: " + time2);
		        } else {
		            System.out.println("Empate.");
		        }
	
		        	sc.close();
	}

}
