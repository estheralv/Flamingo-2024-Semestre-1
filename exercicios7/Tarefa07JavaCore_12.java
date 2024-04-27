package exercicios7;

import java.util.Scanner;

public class Tarefa07JavaCore_12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        final int CODIGO_USUARIO_CORRETO = 1234;
        final int SENHA_CORRETA = 9999;

        System.out.println("Digite o código de usuário:");
        int codigoUsuario = sc.nextInt();

        if (codigoUsuario != CODIGO_USUARIO_CORRETO) {
            System.out.println("Usuário inválido!");
        } else {
            System.out.println("Digite a senha:");
            int senha = sc.nextInt();

            if (senha != SENHA_CORRETA) {
                System.out.println("Senha incorreta!");
            } else {
                System.out.println("Acesso permitido.");
            }
        }

        	sc.close();

	}

}
