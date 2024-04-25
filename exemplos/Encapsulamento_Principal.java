package exemplos;

public class Encapsulamento_Principal {
	
	public static void main(String[] args) {
			
		Encapsulamento_Java_Get_Set pessoa = new Encapsulamento_Java_Get_Set();
		pessoa.setNome("Jonas");
		pessoa.setIdade(23);
		System.out.println("Bem vindo " + pessoa.getNome() + ", sua idade que foi cadastrada é: " + pessoa.getIdade() + " anos.");
			
	}

}
