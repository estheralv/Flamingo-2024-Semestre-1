package exercicios7;

import java.util.Scanner;

public class Tarefa07JavaCore_9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        
        double precoGasolina = 3.30;
        double precoAlcool = 2.90;

        System.out.println("Digite o número de litros vendidos:");
        double litros = sc.nextDouble();

        System.out.println("Digite o tipo de combustível (A para álcool, G para gasolina):");
        char tipo = sc.next().charAt(0);
        
        double valorPago = 0;

	        if (tipo == 'A' || tipo == 'a') {
	            if (litros <= 20) {
	                valorPago = litros * (precoAlcool - (precoAlcool * 0.03));
	            } else {
	                valorPago = litros * (precoAlcool - (precoAlcool * 0.05));
	            }
	        } else if (tipo == 'G' || tipo == 'g') {
	            if (litros <= 20) {
	                valorPago = litros * (precoGasolina - (precoGasolina * 0.04));
	            } else {
	                valorPago = litros * (precoGasolina - (precoGasolina * 0.06));
	            }
	        } else {
	            System.out.println("Tipo de combustível inválido.");
	            return;
	        }

	        System.out.printf("Valor a ser pago: R$ %.2f\n", valorPago);

	        	sc.close();

	}

}
