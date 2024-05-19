package exercicios9;

public class Tarefa09JavaCore_4 {
	    public static void main(String[] args) {
	        int totalQuadrados = 64;

	        double graosNoQuadrado = 1;
	        double somaGraos = 0;

	        for (int quadrado = 1; quadrado <= totalQuadrados; quadrado++) {
	            somaGraos += graosNoQuadrado;
	            System.out.println("Quadrado " + quadrado + ": " + (long)graosNoQuadrado + " grãos, Somatório até agora: " + (long)somaGraos + " grãos");
	            graosNoQuadrado *= 2;
	        }

	        System.out.println("\nTotal de grãos de trigo no tabuleiro: " + (long)somaGraos);
	    }
	}


