package exercicios3;

import java.util.Scanner;

public class Tarefa03JavaCore_10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite qualquer valor para a variável \"A\": ");
		int varialvelA = sc.nextInt();

        System.out.println("Digite qualquer valor para a variável \"B\": ");
		int variavelB = sc.nextInt();

            int temp = varialvelA;
                varialvelA = variavelB;
                variavelB = temp;
		
		System.out.println("Após efetuar a troca, os valores são: Valor de \"A\": " + varialvelA + " e valor de \"B\": "+ variavelB);
			sc.close();
		
	}

}
