package exercicios9;

import java.util.Scanner;

public class Tarefa09JavaCore_10 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o dividendo: ");
        int dividendo = sc.nextInt();

        System.out.print("Digite o divisor: ");
        int divisor = sc.nextInt();

        if (divisor == 0) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        } else {
            int quociente = 0;
            int valorAbsolutoDividendo = Math.abs(dividendo);
            int valorAbsolutoDivisor = Math.abs(divisor);
            int soma = 0;

            while (soma + valorAbsolutoDivisor <= valorAbsolutoDividendo) {
                soma += valorAbsolutoDivisor;
                quociente++;
            }

            if ((dividendo < 0 && divisor > 0) || (dividendo > 0 && divisor < 0)) {
                quociente = -quociente;
            }

            System.out.println("O quociente da divisão inteira é: " + quociente);
        }

        sc.close();
    }

}
