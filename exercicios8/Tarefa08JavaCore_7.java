package exercicios8;

public class Tarefa08JavaCore_7 {

	public static void main(String[] args) {

		int termos = 15;
        int anterior = 1;
        int atual = 1;

        System.out.println("Série de Fibonacci até o décimo quinto termo:");

        System.out.print(anterior + " " + atual + " ");

        for (int i = 3; i <= termos; i++) {
            int proximo = anterior + atual;
            System.out.print(proximo + " ");
            anterior = atual;
            atual = proximo;
            
        }
	}
}
