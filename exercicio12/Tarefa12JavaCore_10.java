package exercicio12;

public class Tarefa12JavaCore_10 {
	
    public static double calcularMediaPonderada(double valor1, double valor2, double valor3, double peso1, double peso2, double peso3) {
        return (valor1 * peso1 + valor2 * peso2 + valor3 * peso3) / (peso1 + peso2 + peso3);
    }


	public static void main(String[] args) {

		double nota1 = 7.5;
        double nota2 = 8.0;
        double nota3 = 6.5;
        double peso1 = 2.0;
        double peso2 = 3.0;
        double peso3 = 1.5;

        double mediaPonderada = calcularMediaPonderada(nota1, nota2, nota3, peso1, peso2, peso3);
        System.out.println("A média ponderada é: " + mediaPonderada);

	}

}
