package exercicios6;

import java.util.Scanner;

public class Tarefa06JavaCore_12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();

        System.out.println("Digite seu sexo (M para masculino, F para feminino):");
        char sexo = sc.next().charAt(0);

        if (sexo == 'M' || sexo == 'm') {
            System.out.println("Sr. " + nome + ", bom dia.");
        } else if (sexo == 'F' || sexo == 'f') {
            System.out.println("Sra. " + nome + ", bom dia.");
        } else {
            System.out.println("Sexo inválido.");
        }

        	sc.close();

	}

}
