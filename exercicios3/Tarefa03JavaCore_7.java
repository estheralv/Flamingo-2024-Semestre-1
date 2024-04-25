package exercicios3;

import java.util.Scanner;

public class Tarefa03JavaCore_7 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio da lata de óleo para ser feito o cálculo de seu volume: ");
		double raioDaLata = sc.nextDouble();

        System.out.println("Digite a altura da lata de óleo para ser feito o cálculo de seu volume: ");
		double alturaDaLata = sc.nextDouble();

            double calculoVolume = Math.PI * (raioDaLata * raioDaLata) * alturaDaLata;

        System.out.println("O volume da lata de óleo é de: " + calculoVolume);

                sc.close();


    }

}
