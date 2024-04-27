package exercicios6;

import java.util.Scanner;

public class Tarefa06JavaCore_3 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        
	     System.out.println("Digite as quatro notas do aluno para saber se foi aprovado.");
	        
	     float primeiraNota = sc.nextFloat();
	     float segundaNota = sc.nextFloat();
	     float terceiraNota = sc.nextFloat();
	     float quartaNota = sc.nextFloat();
	        
	     float media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;
	        
	     	if (media >= 5) {
	            System.out.println("O aluno foi aprovado com a média total de: " + media);
	        } else {
	            System.out.println("O aluno foi reprovado com a média total de: " + media);
	        }
	        
	     		sc.close();

	}

}
