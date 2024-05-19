package exercicios9;

import java.util.Scanner;

public class Tarefa09JavaCore_8 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double areaTotal = 0;

        while (true) {
            System.out.print("Digite o nome do cômodo: ");
            String nomeComodo = sc.nextLine();

            System.out.print("Digite a largura do " + nomeComodo + " em metros: ");
            double largura = sc.nextDouble();

            System.out.print("Digite o comprimento do " + nomeComodo + " em metros: ");
            double comprimento = sc.nextDouble();

            double areaComodo = largura * comprimento;
            System.out.println("A área do " + nomeComodo + " é: " + areaComodo + " metros quadrados.");

            areaTotal += areaComodo;

            System.out.print("Deseja calcular a área de outro cômodo? (SIM/NAO): ");
            sc.nextLine();
            String resposta = sc.nextLine();

            if (resposta.equalsIgnoreCase("NAO")) {
                break;
            }
        }

        System.out.println("A área total da residência é: " + areaTotal + " metros quadrados.");

        sc.close();
    }
}
