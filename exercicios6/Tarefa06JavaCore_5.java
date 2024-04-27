package exercicios6;

import java.util.Scanner;

public class Tarefa06JavaCore_5 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite três valores de para variáveis \"A\", \"B\" e \"C\" para a equação de segundo grau:");
        double variavelA = sc.nextDouble();
        double variavelB = sc.nextDouble();
        double variavelC = sc.nextDouble();
        
        if (variavelA != 0) {
            double delta = variavelB * variavelB - 4 * variavelA * variavelC;
            
            if (delta >= 0) {
                double raiz1 = (-variavelB + Math.sqrt(delta)) / (2 * variavelA);
                double raiz2 = (-variavelB - Math.sqrt(delta)) / (2 * variavelA);
                
                System.out.println("Raiz 1: " + raiz1);
                System.out.println("Raiz 2: " + raiz2);
            } else {
                System.out.println("A equação não possui raízes reais.");
            }
        } else {
            System.out.println("O valor de A não pode ser zero para uma equação de segundo grau.");
        }
        
        	sc.close();

	}

}
