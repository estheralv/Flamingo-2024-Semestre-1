package exemplos;

public class Exemplo02_POO {
	
	String pessoa = "Olá me chamo Fátima!";

	public static void main(String[] args) {

		Exemplo02_POO obj1 = new Exemplo02_POO();
		Exemplo02_POO obj2 = new Exemplo02_POO();
		
		obj2.pessoa = "Trabalho em um banco e tenho 27 anos.";
		
		System.out.println(obj1.pessoa);
		System.out.println(obj2.pessoa);
		
	}

}
