package exercicio12;

public class Tarefa12JavaCore_5 {
	
	public static String inverterString(String invStr) {
        
        StringBuilder builder = new StringBuilder(invStr);
        return builder.reverse().toString();
    }
	
	public static void main(String[] args) {

		String original = "Olá, bom dia";
        String invertida = inverterString(original);
        System.out.println("String invertida: " + invertida);

	}

}
