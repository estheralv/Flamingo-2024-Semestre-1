package exemplos;

public class Celular {
	
	String modelo = "S23";
	int preco = 1000;

	public static void main(String[] args) {

		Celular samsung = new Celular();
		Celular motorola = new Celular();
		Celular asus = new Celular();
		
		samsung.modelo = "Samsung Galaxy S23";
		motorola.modelo = "Moto G9 Plus";
		asus.modelo = "Zenfone 10";
		
		System.out.println("Smartphone da Samsung, modelo: " + samsung.modelo + " tem o valor  total de R$: " + samsung.preco);
		System.out.println("Smartphone da Motorola, modelo: " + motorola.modelo + " tem o valor  total de R$: " + motorola.preco);
		System.out.println("Smartphone da Asus, modelo: " + asus.modelo + " tem o valor  total de R$: " + asus.preco);
		
	}

}
