package exercicios6;

import java.util.Scanner;

public class Tarefa06JavaCore_4 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite as quatro notas do aluno:");
        
        float primeiraNota = sc.nextFloat();
        float segundaNota = sc.nextFloat();
        float terceiraNota = sc.nextFloat();
        float quartaNota = sc.nextFloat();
        
        float media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;
        
        if (media >= 7) {
            System.out.println("O aluno foi aprovado com a média de: " + media);
        } else {
            System.out.println("Digite a nota do exame:");
            float notaExame = sc.nextFloat();
            
            float novaMedia = (media + notaExame) / 2;
            
            if (novaMedia >= 5) {
                System.out.println("O aluno foi aprovado em exame com a média de: " + novaMedia);
            } else {
                System.out.println("O aluno foi reprovado com a média de: " + novaMedia);
            }
        }
        
        	sc.close();
        
	}

}
