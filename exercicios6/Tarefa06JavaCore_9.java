package exercicios6;

import java.util.Scanner;

public class Tarefa06JavaCore_9 {
	
	Scanner sc = new Scanner(System.in);

    System.out.println("Digite um número inteiro e veja se ele é par ou ímpar: ");
    int numero = sc.nextInt();

    if (numero % 2 == 0) {
        System.out.println("O número " + numero + " é par.");
    } else {
        System.out.println("O número " + numero + " é ímpar.");
    }

    	sc.close();
    
    }
}
