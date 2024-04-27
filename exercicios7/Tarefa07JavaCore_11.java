package exercicios7;

import java.util.Scanner;

public class Tarefa07JavaCore_11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        double precoMorangoAte5kg = 2.50;
        double precoMorangoMais5kg = 2.20;
        double precoMacaAte5kg = 1.80;
        double precoMacaMais5kg = 1.50;

        System.out.println("Digite a quantidade de morangos (em Kg):");
        double kgMorango = sc.nextDouble();

        System.out.println("Digite a quantidade de maçãs (em Kg):");
        double kgMaca = sc.nextDouble();
        
        double valorMorango, valorMaca, valorTotal;

        if (kgMorango <= 5) {
            valorMorango = kgMorango * precoMorangoAte5kg;
        } else {
            valorMorango = kgMorango * precoMorangoMais5kg;
        }

        if (kgMaca <= 5) {
            valorMaca = kgMaca * precoMacaAte5kg;
        } else {
            valorMaca = kgMaca * precoMacaMais5kg;
        }
        
        valorTotal = valorMorango + valorMaca;

        if (kgMorango + kgMaca > 8 || valorTotal > 25) {
            valorTotal *= 0.9;
        }

        System.out.printf("Valor a ser pago: R$ %.2f\n", valorTotal);

        	sc.close();

	}

}
