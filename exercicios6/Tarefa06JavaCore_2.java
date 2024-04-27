package exercicios6;

import java.util.Scanner;

public class Tarefa06JavaCore_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        System.out.println("Digite um número inteiro: ");
        int numero = sc.nextInt();
        
        int numeroAbsolutoConvertido = Math.abs(numero);
        
        System.out.println("O valor absoluto do número fornecido é: " + numeroAbsolutoConvertido);
        
        	sc.close();

	}

}
