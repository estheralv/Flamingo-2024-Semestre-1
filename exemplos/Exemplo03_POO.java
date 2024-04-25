package exemplos;

public class Exemplo03_POO {
	
	String primeiroNome = "Barbara";
	String sobreNome = "Mendes";
	int idade = 23;

	public static void main(String[] args) {
		
		Exemplo03_POO obj = new Exemplo03_POO();
		
		System.out.println("Nome: " + obj.primeiroNome + " " + obj.sobreNome);
		System.out.println("Idade: " + obj.idade);

	}

}
