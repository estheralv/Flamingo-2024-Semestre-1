package exemplos;

import java.util.Scanner;

public class ExemploWhile_LacoDeRepeticao {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int contador = 0;
		
		while (contador < 8) {
			System.out.println(contador);
			contador++;
		}
		
			sc.close();
		
	}

}
