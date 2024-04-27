package exercicio12;

import java.util.Scanner;

public class Tarefa12JavaCore_6 {
	
	public static int contadoraVogais(String strinG) {
		int count = 0;
		strinG = strinG.toLowerCase();
        
        for (int i = 0; i < strinG.length(); i++) {
            char ch = strinG.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        
        return count;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu texto para descobrir a quantidade de vogais: ");
        String texto = sc.nextLine();
        int numVogais = contadoraVogais(texto);
        System.out.println("Número de vogais na string: " + numVogais);

        	sc.close();

	}

}
