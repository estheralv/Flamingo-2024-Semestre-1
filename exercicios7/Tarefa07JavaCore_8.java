package exercicios7;

import java.util.Scanner;

public class Tarefa07JavaCore_8 {

	public static void main(String[] args) {

		  Scanner sc = new Scanner(System.in);
	        
	        int[] X = {3, 150, 7, -2, 50};
	        int[] Y = {2, 3, -1, 5, 3};
	        char[] resposta = new char[5];
	        
	        for (int i = 0; i < 5; i++) {
	            int x = X[i];
	            int y = Y[i];
	            int z = (x * y) + 5;
	            
	            if (z <= 0) {
	                resposta[i] = 'A';
	            } else if (z <= 100) {
	                resposta[i] = 'B';
	            } else {
	                resposta[i] = 'C';
	            }
	            
	            System.out.println("X = " + x + ", Y = " + y + ", Z = " + z + ", Resposta = " + resposta[i]);
	        }
	        
	        	sc.close();

	}

}
