package exercicios9;

public class Tarefa09JavaCore_7 {
	
	public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                long fatorial = calcularFatorial(i);
                System.out.println("Fatorial de " + i + " é " + fatorial);
            }
        }
    }

    public static long calcularFatorial(int n) {
        long fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

}
