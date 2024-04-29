package exercicios8;

public class Tarefa08JavaCore_5 {

	public static void main(String[] args) {
		System.out.println("Resultados das potências de 3:");

        int potencia = 1;

        for (int i = 0; i <= 15; i++) {
            System.out.println("3^" + i + " = " + potencia);
            potencia *= 3;
        }

	}

}
