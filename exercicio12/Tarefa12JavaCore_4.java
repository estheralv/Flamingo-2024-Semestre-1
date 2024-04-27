package exercicio12;

public class Tarefa12JavaCore_4 {
	
	public static double calcularMedia(double[] listaDeNumeros) {
        
        double soma = 0;
        for (double numero : listaDeNumeros) {
            soma += numero;
        }
        
        return soma / listaDeNumeros.length;
    }

	public static void main(String[] args) {

		double[] numeros = {2, 4, 6, 8, 10};
        double media = calcularMedia(numeros);
        System.out.println("A média dos números é: " + media);

	}

}
