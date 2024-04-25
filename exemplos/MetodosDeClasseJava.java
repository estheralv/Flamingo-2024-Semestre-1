package exemplos;

public class MetodosDeClasseJava {
	
	public void fraseCarro() {
		System.out.println("O carro está indo o mais rápido que pode!");
	}
	
	public void velocidade(int velocMax) {
		System.out.println("A velocidade máxima é de: " + velocMax);
	}

	public static void main(String[] args) {

		MetodosDeClasseJava obj = new MetodosDeClasseJava();
		obj.fraseCarro();
		obj.velocidade(200);

	}

}
