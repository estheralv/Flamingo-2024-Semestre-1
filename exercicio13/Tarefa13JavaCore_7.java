package exercicio13;

import java.util.Scanner;

public class Tarefa13JavaCore_7 {
	
	public static boolean verificacao(String palavra) {
        palavra = palavra.replaceAll("\\s+", "").toLowerCase();
        
        int inicio = 0;
        int fim = palavra.length() - 1;
        
        while (inicio < fim) {
            char charInicio = palavra.charAt(inicio);
            char charFim = palavra.charAt(fim);
            
            if (charInicio != charFim) {
                return false;
            }
            inicio++;
            fim--;
        }
        
        return true;
    }

	public static void main(String[] args) {

		System.out.println("Digite a palavra desejada para saber se é um palíndromo: ");
		Scanner sc = new Scanner(System.in);
		String palavra = sc.next();
		System.out.println(verificacao(palavra));
		
			sc.close();

	}

}
