package exercicios8;

import java.util.Scanner;

public class Tarefa08JavaCore_11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        double areaTotal = 0;

        while (true) {
            System.out.println("Digite o nome do cômodo:");
            String nome = sc.nextLine();

            System.out.println("Digite a largura do cômodo em metros:");
            double largura = sc.nextDouble();

            System.out.println("Digite o comprimento do cômodo em metros:");
            double comprimento = sc.nextDouble();

            double areaCcomodo = largura * comprimento;
            areaTotal += areaCcomodo;

            System.out.println("Área do cômodo " + nome + ": " + areaCcomodo + " metros quadrados");

            	sc.nextLine();

            System.out.println("Deseja continuar calculando outros cômodos? (SIM/NAO)");
            String resposta = sc.nextLine();

            if (resposta.equalsIgnoreCase("NAO")) {
                break;
            }
        }

        System.out.println("Área total da residência: " + areaTotal + " metros quadrados");

        	sc.close();
		
	}

}
