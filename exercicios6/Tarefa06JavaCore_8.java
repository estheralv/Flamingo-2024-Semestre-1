package exercicios6;

import java.util.Scanner;

public class Tarefa06JavaCore_8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        System.out.println("Digite cinco números inteiros e descubra o maior e menor deles:");

        for (int i = 0; i < 5; i++) {
        	
            int numero = sc.nextInt();

            if (numero > maior) {
                maior = numero;
            }
            
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);

        	sc.close();

	}

}
