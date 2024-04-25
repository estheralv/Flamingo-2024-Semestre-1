package exercicios5;

import java.util.Scanner;

public class Tarefa05JavaCore_12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade atual do estoque: ");
        int quantidadeAtual = sc.nextInt();

        System.out.println("Digite a quantidade máxima do estoque: ");
        int quantidadeMaxima = sc.nextInt();

        System.out.println("Digite a quantidade mínima do estoque: ");
        int quantidadeMinima = sc.nextInt();

        int quantidadeMedia = (quantidadeMaxima + quantidadeMinima) / 2;

        if (quantidadeAtual >= quantidadeMedia) {
            System.out.println("Não efetuar compra");
        } else {
            System.out.println("Efetuar compra");
        }
        
        	sc.close();

	}

}
