package exercicio13;

import java.util.Scanner;

public class Tarefa13JavaCore_10 {
	
	public static boolean verificacaoPrimo(float numero) {
        if (numero <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        
        return true;
    }
	
	public static void main(String[] args) {
		
		System.out.println("Digite o número desejado para saber se é primo: ");
		Scanner sc = new Scanner(System.in);
		float numero = sc.nextFloat();
		System.out.println(verificacaoPrimo(numero));
		
			sc.close();

		
	}

}
