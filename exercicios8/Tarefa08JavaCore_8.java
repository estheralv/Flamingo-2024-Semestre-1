package exercicios8;

public class Tarefa08JavaCore_8 {

	public static void main(String[] args) {

		System.out.println("Celsius   Fahrenheit");
        
        for (int celsius = 10; celsius <= 100; celsius += 10) {
            double fahrenheit = (9 * celsius + 160) / 5.0;
            System.out.println(celsius + "         " + fahrenheit);
        }

	}

}
