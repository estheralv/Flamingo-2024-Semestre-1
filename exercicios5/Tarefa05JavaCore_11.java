package exercicios5;

import java.util.Scanner;

public class Tarefa05JavaCore_11 {

	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da conta do cliente: ");
        int numeroDaConta = sc.nextInt();

        System.out.println("Digite o saldo de sua conta: ");
        float saldo = sc.nextFloat();

        System.out.println("Digite o débito de sua conta: ");
        float debito = sc.nextFloat();

        System.out.println("Digite o crédito de sua conta: ");
        float credito = sc.nextFloat();
        
        float saldoAtual = saldo - debito + credito;

        if (saldoAtual >= 0) {
            System.out.println("Saldo Positivo");
        } else {
            System.out.println("Saldo Negativo");
        }

        System.out.println("O saldo atual da conta é: " + saldoAtual);
        
        	sc.close();

	}

}
