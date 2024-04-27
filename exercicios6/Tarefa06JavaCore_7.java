package exercicios6;

import java.util.Scanner;

public class Tarefa06JavaCore_7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite quatro números inteiros para descobrir os divisíveis por 2 e 3:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        
        String numerosDivisiveis = "";

        if (num1 % 2 == 0 && num1 % 3 == 0) {
            numerosDivisiveis += num1 + " ";
        }
        
        if (num2 % 2 == 0 && num2 % 3 == 0) {
            numerosDivisiveis += num2 + " ";
        }
        
        if (num3 % 2 == 0 && num3 % 3 == 0) {
            numerosDivisiveis += num3 + " ";
        }
        
        if (num4 % 2 == 0 && num4 % 3 == 0) {
            numerosDivisiveis += num4 + " ";
        }
        
        if (numerosDivisiveis.isEmpty()) {
            System.out.println("Nenhum número é divisível por 2 e 3.");
        } else {
            System.out.println("Números divisíveis por 2 e 3: " + numerosDivisiveis);
        }
	}

}
