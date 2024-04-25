package exemplos;

public class ExemploJava_Method9ParametroMaisIfElse {
	
	static void conferirIdade(int age) {
		
		if (age >= 18) {
			System.out.println("O voto é obrigatório!");
		} else if (age >= 16 || age >=65) {
			System.out.println("O voto é opcional!");
		} else {
			System.out.println("Você não pode votar!");
		}
		
	}

	public static void main(String[] args) {
		conferirIdade(64);
	}

}
