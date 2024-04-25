package exemplos;

import java.util.Scanner; 

public class ExemploVotos {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite a sua idade para saber se pode votar ou não: ");
			int idade = sc.nextInt();
			
			String resposta = idade < 16 ? "Não pode votar": idade < 18 ? "Voto opcional": "Voto obrigatório";
				System.out.println(resposta);
			
					sc.close();
				
	}

}
