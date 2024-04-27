package exercicios7;

import java.util.Scanner;

public class Tarefa07JavaCore_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite três valores inteiros para ver a disposição deles em ordem crescente:");
        int variavelA = sc.nextInt();
        int variavelB = sc.nextInt();
        int variavelC = sc.nextInt();
        
        if (variavelA < variavelB && variavelA < variavelC && variavelB < variavelC) {
        	System.out.println("A ordem crescente para os valores desejados é: " + variavelA + ", " + variavelB + ", " + variavelC + ".");
        } else if (variavelA < variavelB && variavelA < variavelC && variavelC < variavelB ) {
        	System.out.println("A ordem crescente para os valores desejados é: " + variavelA + ", " + variavelC + ", " + variavelB + ".");
        } else if(variavelB < variavelA && variavelB < variavelC && variavelA < variavelC) {
        	System.out.println("A ordem crescente para os valores desejados é: " + variavelB + ", " + variavelA + ", " + variavelC + ".");
        } else if (variavelB < variavelA && variavelB < variavelC && variavelC < variavelA) {
        	System.out.println("A ordem crescente para os valores desejados é: " + variavelB + ", " + variavelC + ", " + variavelA + ".");
        } else if (variavelC < variavelA && variavelC < variavelB && variavelA < variavelB) {
        	System.out.println("A ordem crescente para os valores desejados é: " + variavelC + ", " + variavelA + ", " + variavelB + ".");
        } else if (variavelC < variavelA && variavelC < variavelB && variavelB < variavelA) {
        	System.out.println("A ordem crescente para os valores desejados é: " + variavelC + ", " + variavelB + ", " + variavelA + ".");
        } else {
        	System.out.println("Os números são iguais.");
        }
        
        	sc.close();

	}

}
